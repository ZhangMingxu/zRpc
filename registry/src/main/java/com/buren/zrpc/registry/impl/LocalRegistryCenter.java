package com.buren.zrpc.registry.impl;

import com.buren.zrpc.commcon.serializer.Serializer;
import com.buren.zrpc.registry.vo.Service;

/**
 * 本地注册中心
 *
 * @author zhangmingxu ON 16:57 2019-08-20
 **/
public class LocalRegistryCenter extends AbstractRegistryCenter {

    public LocalRegistryCenter(Serializer serializer) {
        super(serializer);
    }

    @Override
    protected Boolean register(Service service) {
        return null;
    }
}
