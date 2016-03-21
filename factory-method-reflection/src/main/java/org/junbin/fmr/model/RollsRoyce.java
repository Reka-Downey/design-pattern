package org.junbin.fmr.model;

import org.junbin.fmr.enumeration.CarBrand;

/**
 * @Date : 2016-03-21 12:24
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 汽车产品类——劳斯莱斯
 */
public class RollsRoyce implements Car {

    @Override
    public String getBrand() {
        return CarBrand.ROLLSROYCE.getName();
    }
}
