package org.junbin.af.model;

import org.junbin.sf.enumeration.FruitType;

/**
 * @Date : 2016-03-20 18:06
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品类——葡萄
 */
public class Grape implements Fruit {

    @Override
    public String getDescription() {
        return FruitType.GRAPE.getName() + createRandomNum();
    }
}
