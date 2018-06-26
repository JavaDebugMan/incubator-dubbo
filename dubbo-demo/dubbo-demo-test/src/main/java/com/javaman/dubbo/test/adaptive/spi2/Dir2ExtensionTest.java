package com.javaman.dubbo.test.adaptive.spi2;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author pengzhe
 * @date 2018/6/26 12:13
 * @description
 */

public class Dir2ExtensionTest {
    public static void main(String[] args) {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Dir2Extension.class);
        Dir2Extension dirExtension = (Dir2Extension) extensionLoader.getAdaptiveExtension();

        String type = null;

        //type = SpiConstants.DIR2_DEFAULT;
        //type = SpiConstants.DIR2_FIRST;

        System.out.println(dirExtension.sayHello("qbb2", type));
    }
}
