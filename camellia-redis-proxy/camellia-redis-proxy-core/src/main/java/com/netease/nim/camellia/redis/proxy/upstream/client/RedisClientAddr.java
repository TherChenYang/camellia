package com.netease.nim.camellia.redis.proxy.upstream.client;

import io.netty.util.concurrent.FastThreadLocal;

import java.util.Objects;

/**
 *
 * Created by caojiajun on 2020/7/10.
 */
public class RedisClientAddr {
    private final String host;
    private final int port;
    private final String userName;
    private final String password;
    private final boolean readonly;
    private final int db;

    private final String url;

    private final FastThreadLocal<RedisClient> cache = new FastThreadLocal<>();

    public RedisClientAddr(String host, int port, String userName, String password) {
        this(host, port, userName, password, false);
    }

    public RedisClientAddr(String host, int port, String userName, String password, int db) {
        this(host, port, userName, password, false, db);
    }

    public RedisClientAddr(String host, int port, String userName, String password, boolean readonly) {
        this(host, port, userName, password, readonly, 0);
    }

    public RedisClientAddr(String host, int port, String userName, String password, boolean readonly, int db) {
        this.host = host;
        this.port = port;
        this.password = password;
        this.userName = userName;
        this.readonly = readonly;
        this.db = db;
        StringBuilder builder = new StringBuilder();
        if (userName != null && password != null) {
            builder.append(userName).append(":").append(password);
        } else if (userName == null && password != null) {
            builder.append(password);
        }
        boolean withParam = false;
        if (readonly) {
            builder.append("@").append(host).append(":").append(port).append("?readonly=").append(true);
            withParam = true;
        } else {
            builder.append("@").append(host).append(":").append(port);
        }
        if (db > 0) {
            if (withParam) {
                builder.append("&db=").append(db);
            } else {
                builder.append("?db=").append(db);
            }
        }
        this.url = builder.toString();
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public int getDb() {
        return db;
    }

    public String getUrl() {
        return url;
    }

    public RedisClient getCache() {
        return cache.get();
    }

    public void setCache(RedisClient cache) {
        this.cache.set(cache);
    }

    public boolean isReadonly() {
        return readonly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RedisClientAddr that = (RedisClientAddr) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        return url;
    }
}