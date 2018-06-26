package com.javaman.dubbo.test.adaptive.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;
import com.javaman.dubbo.test.adaptive.constanse.SpiConstants;

/**
 * @author pengzhe
 * @date 2018/6/26 12:04
 * @description
 */
@SPI("dirDefault")
public interface DirExtension {
    @Adaptive({SpiConstants.DIR_DEFAULT, SpiConstants.DIR_FIRST})
    String sayHello(URL url, String name);
}
