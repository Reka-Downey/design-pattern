package org.junbin.sf.factory;

import org.junbin.sf.enumeration.FruitType;
import org.junbin.sf.model.Apple;
import org.junbin.sf.model.Fruit;
import org.junbin.sf.model.Grape;
import org.junbin.sf.model.Strawberry;

import java.util.NoSuchElementException;

/**
 * @Date : 2016-03-20 19:21
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 简单工厂——水果工厂
 */
public class FruitFactory {

    public static Fruit createFruit(int fruitValue) {
        if (FruitType.APPLE.getValue() == fruitValue) {
            return new Apple();
        } else if (FruitType.GRAPE.getValue() == fruitValue) {
            return new Grape();
        } else if (FruitType.STRAWBERRY.getValue() == fruitValue) {
            return new Strawberry();
        }
        throw new NoSuchElementException("该工厂目前不生产该类水果！");
    }

    public static Fruit createFruit(String fruitName) {
        if (FruitType.APPLE.getName().equals(fruitName)) {
            return new Apple();
        } else if (FruitType.GRAPE.getName().equals(fruitName)) {
            return new Grape();
        } else if (FruitType.STRAWBERRY.getName().equals(fruitName)) {
            return new Strawberry();
        }
        throw new NoSuchElementException("该工厂目前不生产该类水果！");
    }
}
