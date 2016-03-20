package org.junbin.sf.model;

import org.junbin.sf.enumeration.FruitType;

/**
 * @Date : 2016-03-20 18:05
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品类——苹果
 */
public class Apple implements Fruit {

    @Override
    public String getDescription() {
        return FruitType.APPLE.getName() + createRandomNum();
    }

}
