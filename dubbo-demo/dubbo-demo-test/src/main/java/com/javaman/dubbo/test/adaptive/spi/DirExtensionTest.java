package com.javaman.dubbo.test.adaptive.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.javaman.dubbo.test.adaptive.constanse.SpiConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengzhe
 * @date 2018/6/26 12:08
 * @description
 */

public class DirExtensionTest {
    public static void main(String[] args) {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(DirExtension.class);
        //DirExtension dirExtension = (DirExtension)extensionLoader.getExtension("dirFirst");
        DirExtension dirExtension = (DirExtension) extensionLoader.getAdaptiveExtension();

        Map<String, String> parameters = new HashMap<String, String>();
        //parameters.put("dirFirst", "dirFirst");
        parameters.put("dirFirst", SpiConstants.DIR_DEFAULT);
        parameters.put("dirFirst", SpiConstants.DIR_FIRST);
        parameters.put("dirFirst", SpiConstants.DIR2_DEFAULT);

        URL url = new URL("dubbo", "127.0.0.1", 8089, parameters);

        System.out.println(dirExtension.sayHello(url, "哲哥"));
    }
}
