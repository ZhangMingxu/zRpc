package com.buren.zrpc.commcon.serializer;

import java.nio.charset.Charset;

/**
 * 序列化器
 *
 * @author zhangmingxu ON 16:31 2019-08-20
 **/
public interface Serializer {

    /**
     * 将字节码序列化为对象 使用默认的UTF-8字符集
     *
     * @param bytes 字节码
     * @param type  类型
     * @return 对象
     */
    <T> T serialize(byte[] bytes, Class<T> type);

    /**
     * 将字节码序列化为对象
     *
     * @param bytes   字节码
     * @param charset 编码方式
     * @param type    类型
     * @return 对象
     */
    <T> T serialize(byte[] bytes, Charset charset, Class<T> type);

    /**
     * 将字节码序列化为对象
     *
     * @param bytes   字节码
     * @param charset 编码方式
     * @param type    类型
     * @return 对象
     */
    <T> T serialize(byte[] bytes, String charset, Class<T> type);
}
