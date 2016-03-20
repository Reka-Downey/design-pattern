package org.junbin.sf.enumeration;

import java.util.NoSuchElementException;

/**
 * @Date : 2016-03-20 17:56
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 水果的类别
 */
public enum FruitType {

    APPLE("苹果", 1), GRAPE("葡萄", 2), STRAWBERRY("草莓", 3);

    private String name;
    private int value;

    private FruitType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public static FruitType getFruitType(int value) {
        for (FruitType fruitType : FruitType.values()) {
            if (fruitType.getValue() == value) {
                return fruitType;
            }
        }
        throw new NoSuchElementException("不存在该枚举值的枚举，请重新确认枚举值！");
    }

    public static FruitType getFruitType(String name) {
        for (FruitType fruitType : FruitType.values()) {
            if (fruitType.getName().equals(name)) {
                return fruitType;
            }
        }
        throw new NoSuchElementException("不存在该枚举名称的枚举，请重新确认枚举名称！");
    }

}
