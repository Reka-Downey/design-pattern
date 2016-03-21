package org.junbin.builder.model;

/**
 * @Date : 2016-03-21 17:27
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品建造者02——壕气逼人房屋
 */
public class HouseBuilder02 implements Builder {

    private House house = new House();

    @Override
    public void buildRoof() {
        house.setRoof("水晶天花板");
    }

    @Override
    public void buildDoor() {
        house.setDoor("沉香木大门");
    }

    @Override
    public void buildWall() {
        house.setWall("钻石玛瑙墙");
    }

    @Override
    public void buildWindow() {
        house.setWindow("精钢玻璃窗");
    }

    @Override
    public House createHouse() {
        return house;
    }
}
