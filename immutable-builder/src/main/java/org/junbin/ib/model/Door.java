package org.junbin.ib.model;

/**
 * @Date : 2016-03-21 16:53
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：大门
 */
public class Door {

    private String type;

    public Door() {
    }

    public Door(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
