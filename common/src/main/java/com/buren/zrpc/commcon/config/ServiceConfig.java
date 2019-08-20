package com.buren.zrpc.commcon.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务bean
 *
 * @author zhangmingxu ON 15:40 2019-08-20
 **/
public class ServiceConfig {
    private String name; //全包名
    private Class interfaceClass;
    private Map<String, MethodConfig> methods = new HashMap<>(); //有的方法
    private Map<String, ProviderConfig> providers = new ConcurrentHashMap<>(); //提供者
    private List<ConsumerConfig> consumers = new ArrayList<>(); //调用者

    public ServiceConfig(Class interfaceClass) {
        this.name = interfaceClass.getName();

    }

    public void addProvider(ProviderConfig provider) {
        providers.putIfAbsent(provider.getIp(), provider);
    }

    public void addConsumer(ConsumerConfig consumer) {
        consumers.add(consumer);
    }

    public String getName() {
        return name;
    }

    public Map<String, ProviderConfig> getProviders() {
        return providers;
    }
}
