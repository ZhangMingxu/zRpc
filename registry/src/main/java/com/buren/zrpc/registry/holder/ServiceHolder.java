package com.buren.zrpc.registry.holder;

import com.buren.zrpc.commcon.config.ServiceConfig;

/**
 * 保存服务信息
 *
 * @author zhangmingxu ON 17:03 2019-08-20
 **/
public interface ServiceHolder {
    /**
     * 增加一个服务
     *
     * @param service 需要增加的服务
     */
    void addService(ServiceConfig service);

    /**
     * 获取一个服务
     *
     * @param name 服务全类名
     */
    ServiceConfig getService(String name);
}
