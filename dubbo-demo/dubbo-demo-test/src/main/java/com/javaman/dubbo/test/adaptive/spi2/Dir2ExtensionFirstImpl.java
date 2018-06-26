package com.javaman.dubbo.test.adaptive.spi2;

/**
 * @author pengzhe
 * @date 2018/6/26 12:11
 * @description
 */

public class Dir2ExtensionFirstImpl implements Dir2Extension {
    @Override
    public String sayHello(String name, String type) {
        return "dir2Extension-" + name + "-first";
    }
}
