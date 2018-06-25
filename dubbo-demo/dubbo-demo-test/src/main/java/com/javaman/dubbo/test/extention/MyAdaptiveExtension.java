package com.javaman.dubbo.test.extention;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author pengzhe
 * @date 2018/6/25 21:25
 * @description
 */
@Adaptive
public class MyAdaptiveExtension implements MyInterface {
    @SuppressWarnings("rawtypes")
    @Override
    public String sayHello(String name, String type) {
        ExtensionLoader extensionLoader = ExtensionLoader
                .getExtensionLoader(MyInterface.class);
        MyInterface extension = (MyInterface) extensionLoader
                .getDefaultExtension();
        if (ExtensionType.defaults.equals(type)) {
            extension = (MyInterface) extensionLoader
                    .getExtension("defaults");
        }
        if (ExtensionType.other.equals(type)) {
            extension = (MyInterface) extensionLoader
                    .getExtension("other");
        }
        return extension.sayHello(name, type);
    }
}
