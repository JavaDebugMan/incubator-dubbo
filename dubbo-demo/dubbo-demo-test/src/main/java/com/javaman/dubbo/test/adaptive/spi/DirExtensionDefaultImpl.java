package com.javaman.dubbo.test.adaptive.spi;

import com.alibaba.dubbo.common.URL;

/**
 * @author pengzhe
 * @date 2018/6/26 12:06
 * @description
 */

public class DirExtensionDefaultImpl implements DirExtension {
    @Override
    public String sayHello(URL url, String name) {
        return name + "-defualt!!!!!!!";
    }

}
