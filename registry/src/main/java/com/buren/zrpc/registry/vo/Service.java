package com.buren.zrpc.registry.vo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务bean
 *
 * @author zhangmingxu ON 15:40 2019-08-20
 **/
public class Service {
    private String name; //全包名
    private Class interfaceClass;
    private Map<String, RpcMethod> methods = new HashMap<>(); //有的方法
    private List<Provider> providers = new ArrayList<>(); //提供者
    private List<Consumer> consumers = new ArrayList<>(); //调用者

    public Service(Class interfaceClass) {
        this.name = interfaceClass.getName();

    }

    public void addProvider(Provider provider) {
        providers.add(provider);
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public String getName() {
        return name;
    }

    public List<Provider> getProviders() {
        return providers;
    }
}
