package com.buren.zrpc.registry.impl;

import com.buren.zrpc.commcon.config.ProviderConfig;
import com.buren.zrpc.commcon.serializer.Serializer;
import com.buren.zrpc.registry.RegistryCenter;


/**
 * 封装序列化过程
 *
 * @author zhangmingxu ON 16:27 2019-08-20
 **/
public abstract class AbstractRegistryCenter implements RegistryCenter {
    private Serializer serializer;

    public AbstractRegistryCenter(Serializer serializer) {
        this.serializer = serializer;
    }

    public Boolean register(String ip, byte[] info) {
        if (info == null || info.length == 0) {
            return false;
        }
        ProviderConfig providerConfig = serializer.serialize(info, ProviderConfig.class);
        providerConfig.setIp(ip);
        return register(providerConfig);
    }

    protected abstract Boolean register(ProviderConfig provider);
}
