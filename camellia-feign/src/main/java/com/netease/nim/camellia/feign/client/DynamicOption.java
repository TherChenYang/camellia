package com.netease.nim.camellia.feign.client;

import com.netease.nim.camellia.core.util.DynamicValueGetter;
import com.netease.nim.camellia.tools.circuitbreaker.CircuitBreakerConfig;

import java.util.concurrent.TimeUnit;

/**
 * Created by caojiajun on 2022/3/8
 */
public class DynamicOption {

    private DynamicValueGetter<Long> connectTimeout;
    private DynamicValueGetter<TimeUnit> connectTimeoutUnit;
    private DynamicValueGetter<Long> readTimeout;
    private DynamicValueGetter<TimeUnit> readTimeoutUnit;
    private DynamicValueGetter<Boolean> followRedirects;
    private CircuitBreakerConfig circuitBreakerConfig;

    private DynamicOption() {
    }

    public CircuitBreakerConfig getCircuitBreakerConfig() {
        return circuitBreakerConfig;
    }

    public Long getConnectTimeout() {
        if (connectTimeout == null) return null;
        return connectTimeout.get();
    }

    public TimeUnit getConnectTimeoutUnit() {
        if (connectTimeoutUnit == null) return null;
        return connectTimeoutUnit.get();
    }

    public Long getReadTimeout() {
        if (readTimeout == null) return null;
        return readTimeout.get();
    }

    public TimeUnit getReadTimeoutUnit() {
        if (readTimeoutUnit == null) return null;
        return readTimeoutUnit.get();
    }

    public Boolean isFollowRedirects() {
        if (followRedirects == null) return null;
        return followRedirects.get();
    }

    public static class Builder {
        private final DynamicOption dynamicOption = new DynamicOption();
        public Builder() {
        }

        public Builder connectTimeout(DynamicValueGetter<Long> connectTimeout, DynamicValueGetter<TimeUnit> connectTimeoutUnit) {
            dynamicOption.connectTimeout = connectTimeout;
            dynamicOption.connectTimeoutUnit = connectTimeoutUnit;
            return this;
        }

        public Builder readTimeoutTimeout(DynamicValueGetter<Long> readTimeout, DynamicValueGetter<TimeUnit> readTimeoutUnit) {
            dynamicOption.readTimeout = readTimeout;
            dynamicOption.readTimeoutUnit = readTimeoutUnit;
            return this;
        }

        public Builder followRedirects(DynamicValueGetter<Boolean> followRedirects) {
            dynamicOption.followRedirects = followRedirects;
            return this;
        }

        public Builder circuitBreakerConfig(CircuitBreakerConfig circuitBreakerConfig) {
            dynamicOption.circuitBreakerConfig = circuitBreakerConfig;
            return this;
        }

        public DynamicOption build() {
            return dynamicOption;
        }
    }
}
