package org.junbin.sf.model;

import java.util.Random;

/**
 * @Date : 2016-03-20 18:03
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 水果的接口
 */
public interface Fruit {

    String getDescription();

    default int createRandomNum() {
        Random random = new Random();
        int num = random.nextInt(1000) + random.nextInt(500) - random.nextInt(10);
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
