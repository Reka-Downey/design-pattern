package org.junbin.fmr.model;

import org.junbin.fmr.enumeration.CarBrand;

/**
 * @Date : 2016-03-21 12:22
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 汽车产品类——BMW
 */
public class Bmw implements Car {

    @Override
    public String getBrand() {
        return CarBrand.BMW.getName();
    }
}
