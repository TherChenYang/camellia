package com.netease.nim.camellia.hot.key.server.monitor;

import com.netease.nim.camellia.hot.key.server.callback.HotKeyInfo;
import com.netease.nim.camellia.hot.key.server.conf.HotKeyServerProperties;
import com.netease.nim.camellia.tools.executor.CamelliaThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by caojiajun on 2023/5/11
 */
public class HotKeyServerMonitorCollector {

    private static final Logger logger = LoggerFactory.getLogger(HotKeyServerMonitorCollector.class);

    private static final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(new CamelliaThreadFactory("hot-key-server-monitor"));

    public static void init(HotKeyServerProperties properties) {
        HotKeyCollector.init(properties);
        scheduler.scheduleAtFixedRate(HotKeyServerMonitorCollector::collect, properties.getMonitorIntervalSeconds(), properties.getMonitorIntervalSeconds(), TimeUnit.SECONDS);
        logger.info("HotKeyServerMonitorCollector init success, monitor-interval-seconds = {}", properties.getMonitorIntervalSeconds());
    }

    public static HotKeyServerStats serverStats = new HotKeyServerStats();

    public static HotKeyServerStats getHotKeyServerStats() {
        return serverStats;
    }

    private static void collect() {
        HotKeyServerStats serverStats = new HotKeyServerStats();
        QueueStats queueStats = HotKeyCalculatorQueueMonitor.collect();
        TrafficStats trafficStats = HotKeyCalculatorMonitorCollector.collect();
        List<HotKeyInfo> hotKeyInfoList = HotKeyCollector.collect();

        serverStats.setQueueStats(queueStats);
        serverStats.setTrafficStats(trafficStats);
        serverStats.setHotKeyInfoList(hotKeyInfoList);

        logger.info("HotKeyServerMonitorCollector collect success");
    }
}