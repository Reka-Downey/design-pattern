package org.junbin.ib.enumeration;

/**
 * @Date : 2016-03-21 18:31
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum RoofType {

    WOOD("木头"),STONE("石头"), MARBLE("大理石"), AGATE("玛瑙"),  CRYSTAL("水晶"), DIAMOND("钻石"), GOLD("黄金"), THULIUM("铥金");

    private String name;

    RoofType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
