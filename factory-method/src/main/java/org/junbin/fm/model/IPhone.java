package org.junbin.fm.model;

import org.junbin.fm.enumeration.TelephoneType;

/**
 * @Date : 2016-03-20 20:07
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品类——苹果
 */
public class IPhone implements Telephone {

    @Override
    public String getBrand() {
        return TelephoneType.IPHONE.getBrand();
    }
}
