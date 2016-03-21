package org.junbin.fmr.model;

import org.junbin.fmr.enumeration.CarBrand;

/**
 * @Date : 2016-03-21 12:23
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 汽车产品类——沃尔沃
 */
public class Volvo implements Car {

    @Override
    public String getBrand() {
        return CarBrand.VOLVO.getName();
    }
}
