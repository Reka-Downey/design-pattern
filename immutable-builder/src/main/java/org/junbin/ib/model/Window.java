package org.junbin.ib.model;

/**
 * @Date : 2016-03-21 16:52
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：窗户
 */
public class Window {

    private String type;

    public Window() {
    }

    public Window(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
