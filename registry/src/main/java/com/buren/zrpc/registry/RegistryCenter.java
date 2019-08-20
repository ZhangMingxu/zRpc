package com.buren.zrpc.registry;

/**
 * 注册中心
 *
 * @author zhangmingxu ON 16:05 2019-08-20
 **/
public interface RegistryCenter {
    /**
     * 注册一个服务
     *
     * @param info 暴露服务的信息
     */
    Boolean register(byte[] info);


}
