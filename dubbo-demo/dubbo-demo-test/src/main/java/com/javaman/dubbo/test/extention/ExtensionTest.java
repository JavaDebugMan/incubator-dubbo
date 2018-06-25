package com.javaman.dubbo.test.extention;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author pengzhe
 * @date 2018/6/25 21:28
 * @description
 */

public class ExtensionTest {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        ExtensionLoader extensionLoader = ExtensionLoader
                .getExtensionLoader(MyInterface.class);
        MyInterface myFirstExtension = (MyInterface) extensionLoader
                .getAdaptiveExtension();
        System.out.println(myFirstExtension.sayHello("xxx",
                ExtensionType.other));
    }
}
