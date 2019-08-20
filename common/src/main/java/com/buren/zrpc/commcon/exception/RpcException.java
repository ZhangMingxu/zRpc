package com.buren.zrpc.commcon.exception;

/**
 * @author zhangmingxu ON 20:02 2019-08-20
 **/
public class RpcException extends RuntimeException {
    public RpcException(String message) {
        super(message);
    }
}
