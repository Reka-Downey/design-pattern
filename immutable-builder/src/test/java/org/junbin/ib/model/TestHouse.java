package org.junbin.ib.model;

import org.junbin.ib.enumeration.DoorType;
import org.junbin.ib.enumeration.RoofType;
import org.junbin.ib.enumeration.WallType;
import org.junbin.ib.enumeration.WindowType;
import org.junbin.ib.model.part.Door;
import org.junbin.ib.model.part.Roof;
import org.junbin.ib.model.part.Wall;
import org.junbin.ib.model.part.Window;
import org.junit.Test;

/**
 * @Date : 2016-03-21 19:32
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class TestHouse {

    @Test
    public void test() {
        Door door = new Door(DoorType.DIAMOND);
        Wall wall = new Wall(WallType.AGATE);
        Window window = new Window(WindowType.CRYSTAL);
        Roof roof = new Roof(RoofType.THULIUM);
        House house = new House.HouseBuilder().assembleDoor(door).appendDescription(null)
                .assembleRoof(roof).assembleWall(wall).assembleWindow(window).create();
        System.out.println("内存：" + house.toString() + " --> 信息：" + house.info());
        door = house.getDoor();
        door.setType(DoorType.STONE);
        System.out.println("修改大门之后：");
        System.out.println("内存：" + house.toString() + " --> 信息：" + house.info());
        String description = house.getDescription();
        description = "皇家";
        System.out.println("修改描述之后：");
        System.out.println("内存：" + house.toString() + " --> 信息：" + house.info());
    }
}
