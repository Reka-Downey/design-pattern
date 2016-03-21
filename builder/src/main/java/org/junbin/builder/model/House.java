package org.junbin.builder.model;

/**
 * @Date : 2016-03-21 16:55
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品房屋
 */
public class House {

    private String roof;
    private String wall;
    private String window;
    private String door;

    public House() {
    }

    public House(String roof, String wall, String window, String door) {
        this.roof = roof;
        this.wall = wall;
        this.window = window;
        this.door = door;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String info() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", wall='" + wall + '\'' +
                ", window='" + window + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
