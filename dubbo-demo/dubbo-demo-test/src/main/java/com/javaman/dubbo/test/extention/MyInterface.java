package com.javaman.dubbo.test.extention;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author pengzhe
 * @date 2018/6/25 21:20
 * @description
 */
@SPI()
public interface MyInterface {
    String sayHello(String name, String type);
}
