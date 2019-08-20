package com.buren.zrpc.registry.impl;

import com.buren.zrpc.commcon.serializer.Serializer;
import com.buren.zrpc.commcon.vo.ProviderInfo;
import com.buren.zrpc.registry.holder.ServiceHolder;
import com.buren.zrpc.registry.holder.impl.LocalServiceHolder;
import com.buren.zrpc.registry.vo.Provider;
import com.buren.zrpc.registry.vo.Service;

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
    protected Boolean register(ProviderInfo provider) {
        Service old = holder.getService(provider.getInterfaceClass().getName());
        if (old != null) {
            old.addProvider(new Provider(provider.getProviderIp()));
        } else {
            Service service = new Service(provider.getInterfaceClass());
            service.addProvider(new Provider(provider.getProviderIp()));
        }
        return true;
    }
}
