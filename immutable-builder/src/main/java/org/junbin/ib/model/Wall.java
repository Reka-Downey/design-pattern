package org.junbin.ib.model;

/**
 * @Date : 2016-03-21 16:51
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：墙壁
 */
public class Wall {

    private String type;

    public Wall() {
    }

    public Wall(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
