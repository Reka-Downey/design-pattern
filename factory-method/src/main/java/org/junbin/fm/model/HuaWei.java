package org.junbin.fm.model;

import org.junbin.fm.enumeration.TelephoneType;

/**
 * @Date : 2016-03-20 20:08
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品类——华为
 */
public class HuaWei implements Telephone {

    @Override
    public String getBrand() {
        return TelephoneType.HUAWEI.getBrand();
    }
}
