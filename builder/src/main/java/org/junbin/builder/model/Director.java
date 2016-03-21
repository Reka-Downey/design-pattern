package org.junbin.builder.model;

/**
 * @Date : 2016-03-21 17:42
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 房屋建造指挥家
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public House buildHouse(){
        builder.buildDoor();
        builder.buildRoof();
        builder.buildWindow();
        builder.buildWall();
        return builder.createHouse();
    }
}
