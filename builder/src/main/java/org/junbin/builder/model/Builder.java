package org.junbin.builder.model;

/**
 * @Date : 2016-03-21 16:59
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 建造者接口——指明产品需要有经过哪些步骤才能建造完成
 */
public interface Builder {

    void buildRoof();

    void buildDoor();

    void buildWall();

    void buildWindow();

    House createHouse();
}
