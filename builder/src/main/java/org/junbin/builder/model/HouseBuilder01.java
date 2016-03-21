package org.junbin.builder.model;

/**
 * @Date : 2016-03-21 16:53
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品建造者01——中规中矩房屋
 */
public class HouseBuilder01 implements Builder {

    private House house = new House();

    @Override
    public void buildRoof() {
        house.setRoof("石头屋顶");
    }

    @Override
    public void buildDoor() {
        house.setDoor("红木大门");
    }

    @Override
    public void buildWall() {
        house.setWall("大理石墙");
    }

    @Override
    public void buildWindow() {
        house.setWindow("铝合金窗");
    }

    @Override
    public House createHouse() {
        return house;
    }
}
