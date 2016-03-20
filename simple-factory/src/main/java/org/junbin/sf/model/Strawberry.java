package org.junbin.sf.model;

import org.junbin.sf.enumeration.FruitType;

/**
 * @Date : 2016-03-20 18:06
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品类——草莓
 */
public class Strawberry implements Fruit {

    @Override
    public String getDescription() {
        return FruitType.STRAWBERRY.getName() + createRandomNum();
    }
}
