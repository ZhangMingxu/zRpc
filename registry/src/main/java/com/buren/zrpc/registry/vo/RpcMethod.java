package com.buren.zrpc.registry.vo;

import java.lang.reflect.Method;

/**
 * @author zhangmingxu ON 15:42 2019-08-20
 **/
public class RpcMethod {
    private String name;
    private Object[] args;
    private Object returnValue;

    public RpcMethod(Method method) {
    }
}
