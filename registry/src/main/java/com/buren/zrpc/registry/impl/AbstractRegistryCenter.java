package com.buren.zrpc.registry.impl;

import com.buren.zrpc.commcon.serializer.Serializer;
import com.buren.zrpc.commcon.vo.ProviderInfo;
import com.buren.zrpc.registry.RegistryCenter;
import com.buren.zrpc.registry.vo.Service;


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

    public Boolean register(byte[] info) {
        if (info == null || info.length == 0) {
            return false;
        }
        return register(serializer.serialize(info, ProviderInfo.class));
    }

    protected abstract Boolean register(ProviderInfo provider);
}
