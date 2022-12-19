package com.netease.nim.camellia.cache.core;


public enum CamelliaCacheNameEnum {

    REMOTE_MINUTE_1(CamelliaCacheName.REMOTE_MINUTE_1, false, 1000L*60),
    REMOTE_MINUTE_10(CamelliaCacheName.REMOTE_MINUTE_10, false, 1000L*60*10),
    REMOTE_MINUTE_30(CamelliaCacheName.REMOTE_MINUTE_30, false, 1000L*60*30),
    REMOTE_HOUR_1(CamelliaCacheName.REMOTE_HOUR_1, false, 1000L*60*60),
    REMOTE_HOUR_4(CamelliaCacheName.REMOTE_HOUR_4, false, 1000L*60*60*4),
    REMOTE_HOUR_12(CamelliaCacheName.REMOTE_HOUR_12, false, 1000L*60*60*12),
    REMOTE_DAY_1(CamelliaCacheName.REMOTE_DAY_1, false, 1000L*60*60*24),
    REMOTE_DAY_3(CamelliaCacheName.REMOTE_DAY_3, false, 1000L*60*60*24*3),
    REMOTE_DAY_7(CamelliaCacheName.REMOTE_DAY_7, false, 1000L*60*60*24*7),
    REMOTE_DAY_30(CamelliaCacheName.REMOTE_DAY_30, false, 1000L*60*60*24*30),
    REMOTE_DAY_365(CamelliaCacheName.REMOTE_DAY_365, false, 1000L*60*60*24*365),
    REMOTE_FOREVER(CamelliaCacheName.REMOTE_FOREVER, false, -1),

    REMOTE_MINUTE_1_CACHE_NULL(CamelliaCacheName.REMOTE_MINUTE_1_CACHE_NULL, true, 1000L*60),
    REMOTE_MINUTE_10_CACHE_NULL(CamelliaCacheName.REMOTE_MINUTE_10_CACHE_NULL, true, 1000L*60*10),
    REMOTE_MINUTE_30_CACHE_NULL(CamelliaCacheName.REMOTE_MINUTE_30_CACHE_NULL, true, 1000L*60*30),
    REMOTE_HOUR_1_CACHE_NULL(CamelliaCacheName.REMOTE_HOUR_1_CACHE_NULL, true, 1000L*60*60),
    REMOTE_HOUR_4_CACHE_NULL(CamelliaCacheName.REMOTE_HOUR_4_CACHE_NULL, true, 1000L*60*60*4),
    REMOTE_HOUR_12_CACHE_NULL(CamelliaCacheName.REMOTE_HOUR_12_CACHE_NULL, true, 1000L*60*60*12),
    REMOTE_DAY_1_CACHE_NULL(CamelliaCacheName.REMOTE_DAY_1_CACHE_NULL, true, 1000L*60*60*24),
    REMOTE_DAY_3_CACHE_NULL(CamelliaCacheName.REMOTE_DAY_3_CACHE_NULL, true, 1000L*60*60*24*3),
    REMOTE_DAY_7_CACHE_NULL(CamelliaCacheName.REMOTE_DAY_7_CACHE_NULL, true, 1000L*60*60*24*7),
    REMOTE_DAY_30_CACHE_NULL(CamelliaCacheName.REMOTE_DAY_30_CACHE_NULL, true, 1000L*60*60*24*30),
    REMOTE_DAY_365_CACHE_NULL(CamelliaCacheName.REMOTE_DAY_365_CACHE_NULL, true, 1000L*60*60*24*365),
    REMOTE_FOREVER_CACHE_NULL(CamelliaCacheName.REMOTE_FOREVER_CACHE_NULL, true, -1),

    LOCAL_MILLIS_10(CamelliaCacheName.LOCAL_MILLIS_10, false, 10L),
    LOCAL_MILLIS_100(CamelliaCacheName.LOCAL_MILLIS_100, false, 100L),
    LOCAL_MILLIS_500(CamelliaCacheName.LOCAL_MILLIS_500, false, 500L),
    LOCAL_SECOND_1(CamelliaCacheName.LOCAL_SECOND_1, false, 1000L),
    LOCAL_SECOND_5(CamelliaCacheName.LOCAL_SECOND_5, false, 1000L*5),
    LOCAL_SECOND_10(CamelliaCacheName.LOCAL_SECOND_10, false, 1000L*10),
    LOCAL_SECOND_30(CamelliaCacheName.LOCAL_SECOND_30, false, 1000L*30),
    LOCAL_MINUTE_1(CamelliaCacheName.LOCAL_MINUTE_1, false, 1000L*60),
    LOCAL_MINUTE_5(CamelliaCacheName.LOCAL_MINUTE_5, false, 1000L*60*5),
    LOCAL_MINUTE_10(CamelliaCacheName.LOCAL_MINUTE_10, false, 1000L*60*10),
    LOCAL_MINUTE_30(CamelliaCacheName.LOCAL_MINUTE_30, false, 1000L*60*30),
    LOCAL_HOUR_1(CamelliaCacheName.LOCAL_HOUR_1, false, 1000L*60*60),
    LOCAL_HOUR_24(CamelliaCacheName.LOCAL_HOUR_24, false, 1000L*60*60*24),
    LOCAL_FOREVER(CamelliaCacheName.LOCAL_FOREVER, false, -1),

    LOCAL_MILLIS_10_CACHE_NULL(CamelliaCacheName.LOCAL_MILLIS_10_CACHE_NULL, true, 10L),
    LOCAL_MILLIS_100_CACHE_NULL(CamelliaCacheName.LOCAL_MILLIS_100_CACHE_NULL, true, 100L),
    LOCAL_MILLIS_500_CACHE_NULL(CamelliaCacheName.LOCAL_MILLIS_500_CACHE_NULL, true, 500L),
    LOCAL_SECOND_1_CACHE_NULL(CamelliaCacheName.LOCAL_SECOND_1_CACHE_NULL, true, 1000L),
    LOCAL_SECOND_5_CACHE_NULL(CamelliaCacheName.LOCAL_SECOND_5_CACHE_NULL, true, 1000L*5),
    LOCAL_SECOND_10_CACHE_NULL(CamelliaCacheName.LOCAL_SECOND_10_CACHE_NULL, true, 1000L*10),
    LOCAL_SECOND_30_CACHE_NULL(CamelliaCacheName.LOCAL_SECOND_30_CACHE_NULL, true, 1000L*30),
    LOCAL_MINUTE_1_CACHE_NULL(CamelliaCacheName.LOCAL_MINUTE_1_CACHE_NULL, true, 1000L*60),
    LOCAL_MINUTE_5_CACHE_NULL(CamelliaCacheName.LOCAL_MINUTE_5_CACHE_NULL, true, 1000L*60*5),
    LOCAL_MINUTE_10_CACHE_NULL(CamelliaCacheName.LOCAL_MINUTE_10_CACHE_NULL, true, 1000L*60*10),
    LOCAL_MINUTE_30_CACHE_NULL(CamelliaCacheName.LOCAL_MINUTE_30_CACHE_NULL, true, 1000L*60*30),
    LOCAL_HOUR_1_CACHE_NULL(CamelliaCacheName.LOCAL_HOUR_1_CACHE_NULL, true, 1000L*60*60),
    LOCAL_HOUR_24_CACHE_NULL(CamelliaCacheName.LOCAL_HOUR_24_CACHE_NULL, true, 1000L*60*60*24),
    LOCAL_FOREVER_CACHE_NULL(CamelliaCacheName.LOCAL_FOREVER_CACHE_NULL, true, -1),

    SAFE_LOCAL_MILLIS_10(CamelliaCacheName.SAFE_LOCAL_MILLIS_10, false, 10L),
    SAFE_LOCAL_MILLIS_100(CamelliaCacheName.SAFE_LOCAL_MILLIS_100, false, 100L),
    SAFE_LOCAL_MILLIS_500(CamelliaCacheName.SAFE_LOCAL_MILLIS_500, false, 500L),
    SAFE_LOCAL_SECOND_1(CamelliaCacheName.SAFE_LOCAL_SECOND_1, false, 1000L),
    SAFE_LOCAL_SECOND_5(CamelliaCacheName.SAFE_LOCAL_SECOND_5, false, 1000L*5),
    SAFE_LOCAL_SECOND_10(CamelliaCacheName.SAFE_LOCAL_SECOND_10, false, 1000L*10),
    SAFE_LOCAL_SECOND_30(CamelliaCacheName.SAFE_LOCAL_SECOND_30, false, 1000L*30),
    SAFE_LOCAL_MINUTE_1(CamelliaCacheName.SAFE_LOCAL_MINUTE_1, false, 1000L*60),
    SAFE_LOCAL_MINUTE_5(CamelliaCacheName.SAFE_LOCAL_MINUTE_5, false, 1000L*60*5),
    SAFE_LOCAL_MINUTE_10(CamelliaCacheName.SAFE_LOCAL_MINUTE_10, false, 1000L*60*10),
    SAFE_LOCAL_MINUTE_30(CamelliaCacheName.SAFE_LOCAL_MINUTE_30, false, 1000L*60*30),
    SAFE_LOCAL_HOUR_1(CamelliaCacheName.SAFE_LOCAL_HOUR_1, false, 1000L*60*60),
    SAFE_LOCAL_HOUR_24(CamelliaCacheName.SAFE_LOCAL_HOUR_24, false, 1000L*60*60*24),
    SAFE_LOCAL_FOREVER(CamelliaCacheName.SAFE_LOCAL_FOREVER, false, -1),

    SAFE_LOCAL_MILLIS_10_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MILLIS_10_CACHE_NULL, true, 10L),
    SAFE_LOCAL_MILLIS_100_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MILLIS_100_CACHE_NULL, true, 100L),
    SAFE_LOCAL_MILLIS_500_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MILLIS_500_CACHE_NULL, true, 500L),
    SAFE_LOCAL_SECOND_1_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_SECOND_1_CACHE_NULL, true, 1000L),
    SAFE_LOCAL_SECOND_5_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_SECOND_5_CACHE_NULL, true, 1000L*5),
    SAFE_LOCAL_SECOND_10_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_SECOND_10_CACHE_NULL, true, 1000L*10),
    SAFE_LOCAL_SECOND_30_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_SECOND_30_CACHE_NULL, true, 1000L*30),
    SAFE_LOCAL_MINUTE_1_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MINUTE_1_CACHE_NULL, true, 1000L*60),
    SAFE_LOCAL_MINUTE_5_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MINUTE_5_CACHE_NULL, true, 1000L*60*5),
    SAFE_LOCAL_MINUTE_10_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MINUTE_10_CACHE_NULL, true, 1000L*60*10),
    SAFE_LOCAL_MINUTE_30_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_MINUTE_30_CACHE_NULL, true, 1000L*60*30),
    SAFE_LOCAL_HOUR_1_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_HOUR_1_CACHE_NULL, true, 1000L*60*60),
    SAFE_LOCAL_HOUR_24_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_HOUR_24_CACHE_NULL, true, 1000L*60*60*24),
    SAFE_LOCAL_FOREVER_CACHE_NULL(CamelliaCacheName.SAFE_LOCAL_FOREVER_CACHE_NULL, true, -1),
    ;

    private String name;
    private boolean cacheNull;
    private long expireMillis;

    CamelliaCacheNameEnum(String name, boolean cacheNull, long expireMillis) {
        this.name = name;
        this.cacheNull = cacheNull;
        this.expireMillis = expireMillis;
    }

    public String getName() {
        return name;
    }

    public boolean isCacheNull() {
        return cacheNull;
    }

    public long getExpireMillis() {
        return expireMillis;
    }
}
