package com.buren.zrpc.registry.impl;

import com.buren.zrpc.commcon.serializer.Serializer;
import com.buren.zrpc.registry.holder.ServiceHolder;
import com.buren.zrpc.registry.holder.impl.LocalServiceHolder;
import com.buren.zrpc.commcon.config.ProviderConfig;
import com.buren.zrpc.commcon.config.ServiceConfig;

/**
 * 本地注册中心
 *
 * @author zhangmingxu ON 16:57 2019-08-20
 **/
public class LocalRegistryCenter extends AbstractRegistryCenter {
    private static final ServiceHolder holder = new LocalServiceHolder();

    public LocalRegistryCenter(Serializer serializer) {
        super(serializer);
    }

    @Override
    protected Boolean register(ProviderConfig provider) {
        ServiceConfig service = holder.getService(provider.getInterfaceClass().getName());
        if (service == null) {
            service = new ServiceConfig(provider.getInterfaceClass());
            holder.addService(service);
        }
        service.addProvider(provider);
        return true;
    }
}
