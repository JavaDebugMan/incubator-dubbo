package com.javaman.dubbo.test.extention;

/**
 * @author pengzhe
 * @date 2018/6/25 21:24
 * @description
 */

public class DefaultExtensionImpl implements MyInterface {
    @Override
    public String sayHello(String name, String type) {
        return this.getClass().getName() + "  " + name + "  " + type;
    }
}
