package com.javaman.dubbo.test.adaptive.spi2;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author pengzhe
 * @date 2018/6/26 12:10
 * @description
 */
@SPI("dir2Default")
public interface Dir2Extension {
    String sayHello(String name, String type);
}
