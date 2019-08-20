package com.buren.zrpc.commcon.config;

/**
 * @author zhangmingxu ON 15:45 2019-08-20
 **/
public class ProviderConfig {
    private Class interfaceClass;
    private String ip;

    public ProviderConfig(Class interfaceClass, String ip) {
        this.interfaceClass = interfaceClass;
        this.ip = ip;
    }

    public Class getInterfaceClass() {
        return interfaceClass;
    }

    public void setInterfaceClass(Class interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
