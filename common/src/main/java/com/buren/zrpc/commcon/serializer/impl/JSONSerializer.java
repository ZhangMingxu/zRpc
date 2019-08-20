package com.buren.zrpc.commcon.serializer.impl;

import com.alibaba.fastjson.JSON;
import com.buren.zrpc.commcon.serializer.Serializer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author zhangmingxu ON 16:34 2019-08-20
 **/
public class JSONSerializer implements Serializer {
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public <T> T serialize(byte[] bytes, Class<T> type) {
        return serialize(bytes, DEFAULT_CHARSET, type);
    }

    public <T> T serialize(byte[] bytes, String charset, Class<T> type) {
        return serialize(bytes, Charset.forName(charset), type);
    }

    public <T> T serialize(byte[] bytes, Charset charset, Class<T> type) {
        if (bytes == null || bytes.length == 0 || charset == null || type == null) {
            throw new IllegalArgumentException("序列化参数异常");
        }
        String s = new String(bytes, charset);
        return JSON.parseObject(s, type);
    }
}
