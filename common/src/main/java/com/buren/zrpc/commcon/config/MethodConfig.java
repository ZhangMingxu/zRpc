package com.buren.zrpc.commcon.config;

import java.lang.reflect.Method;

/**
 * @author zhangmingxu ON 15:42 2019-08-20
 **/
public class MethodConfig {
    private String name;
    private Object[] args;
    private Object returnValue;

    public MethodConfig(Method method) {
    }
}
