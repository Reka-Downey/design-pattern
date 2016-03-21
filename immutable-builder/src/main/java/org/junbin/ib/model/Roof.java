package org.junbin.ib.model;

/**
 * @Date : 2016-03-21 16:50
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：房屋
 */
public class Roof {

    private String type;

    public Roof() {
    }

    public Roof(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
