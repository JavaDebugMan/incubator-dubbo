package com.javaman.dubbo.test.extention;

/**
 * @author pengzhe
 * @date 2018/6/25 21:25
 * @description
 */

public class OtherExtensionImpl implements MyInterface {
    @Override
    public String sayHello(String name, String type) {
        return this.getClass().getName() + "  " + name + "  " + type;
    }
}
