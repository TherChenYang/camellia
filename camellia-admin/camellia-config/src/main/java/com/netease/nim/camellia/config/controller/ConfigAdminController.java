package com.netease.nim.camellia.config.controller;

import com.netease.nim.camellia.config.conf.LogBean;
import com.netease.nim.camellia.config.model.Config;
import com.netease.nim.camellia.config.model.ConfigHistory;
import com.netease.nim.camellia.config.model.ConfigNamespace;
import com.netease.nim.camellia.config.service.ConfigNamespaceService;
import com.netease.nim.camellia.config.service.ConfigService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;


/**
 * Created by caojiajun on 2023/3/15
 */
@Api(value = "管理接口", tags = {"ConfigAdminController"})
@RestController
@RequestMapping("/camellia/config/admin")
public class ConfigAdminController {

    @Autowired
    private ConfigService configService;

    @Autowired
    private ConfigNamespaceService configNamespaceService;

    @PostMapping("/createOrUpdateConfig")
    public WebResult createOrUpdateConfig(@RequestParam("namespace") String namespace,
                                          @RequestParam("key") String key,
                                          @RequestParam(value = "value", required = false) String value,
                                          @RequestParam(value = "type", required = false) Integer type,
                                          @RequestParam(value = "info", required = false) String info,
                                          @RequestParam(value = "version", required = false) Long version,
                                          @RequestParam(value = "validFlag", required = false) Integer validFlag) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("key", key);
        LogBean.get().addProps("value", value);
        LogBean.get().addProps("type", type);
        LogBean.get().addProps("version", version);
        LogBean.get().addProps("info", info);
        LogBean.get().addProps("validFlag", validFlag);
        Config config = configService.createOrUpdateConfig(namespace, key, value, type, info, version, validFlag);
        LogBean.get().addProps("config", config);
        return WebResult.success(config);
    }

    @PostMapping("/getConfigList")
    public WebResult getConfigList(@RequestParam("namespace") String namespace,
                                   @RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                                   @RequestParam(value = "limit", required = false, defaultValue = "100") int limit,
                                   @RequestParam(value = "onlyValid", required = false, defaultValue = "true") boolean onlyValid,
                                   @RequestParam(value = "keyword", required = false) String keyword) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("onlyValid", onlyValid);
        LogBean.get().addProps("offset", offset);
        LogBean.get().addProps("limit", limit);
        LogBean.get().addProps("keyword", keyword);
        List<Config> configList = configService.getConfigList(namespace, offset, limit, onlyValid, keyword);
        LogBean.get().addProps("configList", configList);
        return WebResult.success(configList);
    }

    @PostMapping(value = "/getConfigString", produces = "text/plain;charset=UTF-8")
    public String getConfigString(@RequestParam("namespace") String namespace,
                                  @RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                                  @RequestParam(value = "limit", required = false, defaultValue = "100") int limit,
                                  @RequestParam(value = "onlyValid", required = false, defaultValue = "true") boolean onlyValid,
                                  @RequestParam(value = "keyword", required = false) String keyword) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("onlyValid", onlyValid);
        LogBean.get().addProps("keyword", keyword);
        String configString = configService.getConfigString(namespace, offset, limit, onlyValid, keyword);
        LogBean.get().addProps("configString", configString);
        return configString;
    }

    @PostMapping("/getConfigByKey")
    public WebResult getConfigByKey(@RequestParam("namespace") String namespace,
                                    @RequestParam("key") String key) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("key", key);
        Config config = configService.getConfigByKey(namespace, key);
        LogBean.get().addProps("config", config);
        return WebResult.success(config);
    }

    @PostMapping("/deleteConfig")
    public WebResult deleteConfig(@RequestParam("namespace") String namespace,
                                  @RequestParam("id") long id,
                                  @RequestParam("key") String key,
                                  @RequestParam(value = "version", required = false) Long version) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("id", id);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("key", key);
        int ret = configService.deleteConfig(namespace, id, key, version);
        return WebResult.success(ret);
    }

    @PostMapping("/getConfigNamespaceHistoryList")
    public WebResult getConfigNamespaceHistoryList(@RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                                                   @RequestParam(value = "limit", required = false, defaultValue = "100") int limit,
                                                   @RequestParam(value = "keyword", required = false) String keyword) {
        LogBean.get().addProps("offset", offset);
        LogBean.get().addProps("limit", limit);
        LogBean.get().addProps("keyword", keyword);
        List<ConfigHistory> configHistoryList = configService.getConfigNamespaceHistoryList(offset, limit, keyword);
        return WebResult.success(configHistoryList);
    }

    @PostMapping("/getConfigHistoryListByNamespace")
    public WebResult getConfigHistoryListByNamespace(@RequestParam("namespace") String namespace,
                                                     @RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                                                     @RequestParam(value = "limit", required = false, defaultValue = "100") int limit,
                                                     @RequestParam(value = "keyword", required = false) String keyword) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("offset", offset);
        LogBean.get().addProps("limit", limit);
        LogBean.get().addProps("keyword", keyword);
        List<ConfigHistory> configHistoryList = configService.getConfigHistoryListByNamespace(namespace, offset, limit, keyword);
        return WebResult.success(configHistoryList);
    }

    @PostMapping("/getConfigHistoryListByConfigId")
    public WebResult getConfigHistoryListByConfigId(@RequestParam("namespace") String namespace,
                                                    @RequestParam(value = "id") Long id,
                                                    @RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                                                    @RequestParam(value = "limit", required = false, defaultValue = "100") int limit,
                                                    @RequestParam(value = "keyword", required = false) String keyword) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("id", id);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("offset", offset);
        LogBean.get().addProps("limit", limit);
        LogBean.get().addProps("keyword", keyword);
        List<ConfigHistory> configHistoryList = configService.getConfigHistoryListByConfigId(namespace, id, offset, limit, keyword);
        return WebResult.success(configHistoryList);
    }

    @PostMapping("/createOrUpdateConfigNamespace")
    public WebResult createOrUpdateConfigNamespace(@RequestParam("namespace") String namespace,
                                                   @RequestParam(value = "info", required = false) String info,
                                                   @RequestParam(value = "alias", required = false) String alias,
                                                   @RequestParam(value = "version", required = false) Integer version,
                                                   @RequestParam(value = "validFlag", required = false) Integer validFlag) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("info", info);
        LogBean.get().addProps("validFlag", validFlag);
        LogBean.get().addProps("version", version);
        LogBean.get().addProps("alias", alias);
        ConfigNamespace configNamespace = configNamespaceService.createOrUpdateConfigNamespace(namespace, info, alias, version, validFlag);
        LogBean.get().addProps("configNamespace", configNamespace);
        return WebResult.success(configNamespace);
    }

    @PostMapping("/deleteConfigNamespace")
    public WebResult deleteConfigNamespace(@RequestParam(value = "id", required = false) Long id,
                                           @RequestParam(value = "version") Integer version,
                                           @RequestParam("namespace") String namespace) {
        namespace  = namespace.toLowerCase(Locale.ROOT);
        LogBean.get().addProps("namespace", namespace);
        LogBean.get().addProps("id", id);
        LogBean.get().addProps("version", version);
        int ret = configNamespaceService.deleteConfigNamespace(id, namespace, version);
        LogBean.get().addProps("ret", ret);
        return WebResult.success(ret);
    }

    @PostMapping("/getConfigNamespaceList")
    public WebResult getConfigNamespaceList(@RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
                                            @RequestParam(value = "limit", required = false, defaultValue = "100") int limit,
                                            @RequestParam(value = "onlyValid", required = false, defaultValue = "true") boolean onlyValid,
                                            @RequestParam(value = "keyword", required = false) String keyword) {
        LogBean.get().addProps("offset", offset);
        LogBean.get().addProps("limit", limit);
        LogBean.get().addProps("keyword", keyword);
        List<ConfigNamespace> list = configNamespaceService.getList(offset, limit, onlyValid, keyword);
        LogBean.get().addProps("list.size", list.size());
        return WebResult.success(list);
    }
}