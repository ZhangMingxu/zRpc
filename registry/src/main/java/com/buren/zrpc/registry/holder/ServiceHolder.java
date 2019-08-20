package com.buren.zrpc.registry.holder;

import com.buren.zrpc.registry.vo.Service;

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
    void addService(Service service);

    /**
     * 获取一个服务
     *
     * @param name 服务全类名
     */
    Service getService(String name);
}
