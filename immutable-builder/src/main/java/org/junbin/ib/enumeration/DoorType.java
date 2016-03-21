package org.junbin.ib.enumeration;

/**
 * @Date : 2016-03-21 18:28
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum DoorType {

    WOOD("木头"), STONE("石头"), MARBLE("大理石"), DIAMOND("钻石"), GOLD("黄金"), THULIUM("铥金");

    private String name;

    DoorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
