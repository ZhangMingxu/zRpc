package com.buren.zrpc.commcon.vo;

/**
 * @author zhangmingxu ON 17:28 2019-08-20
 **/
public class ProviderInfo<T> {
    private Class interfaceClass;
    private String providerIp;

    public ProviderInfo(Class interfaceClass, String providerIp) {
        this.interfaceClass = interfaceClass;
        this.providerIp = providerIp;
    }

    public Class getInterfaceClass() {
        return interfaceClass;
    }

    public void setInterfaceClass(Class interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    public String getProviderIp() {
        return providerIp;
    }

    public void setProviderIp(String providerIp) {
        this.providerIp = providerIp;
    }
}
