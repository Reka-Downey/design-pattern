package org.junbin.fm.model;

import org.junbin.fm.enumeration.TelephoneType;

/**
 * @Date : 2016-03-20 20:04
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品类——三星
 */
public class SamSung implements Telephone {

    @Override
    public String getBrand() {
        return TelephoneType.SAMSUNG.getBrand();
    }

}
