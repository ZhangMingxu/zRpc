package com.buren.zrpc.registry.holder.impl;

import com.buren.zrpc.registry.holder.ServiceHolder;
import com.buren.zrpc.commcon.config.ServiceConfig;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 使用本地内存实现服务的保存和获取
 *
 * @author zhangmingxu ON 17:08 2019-08-20
 **/
public class LocalServiceHolder implements ServiceHolder {
    private static final Map<String, ServiceConfig> holder = new ConcurrentHashMap<>();

    @Override
    public void addService(ServiceConfig service) {
        holder.put(service.getName(), service);
    }

    @Override
    public ServiceConfig getService(String name) {
        return holder.get(name);
    }
}
