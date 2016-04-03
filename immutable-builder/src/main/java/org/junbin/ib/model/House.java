package org.junbin.ib.model;

import org.apache.commons.lang.StringUtils;
import org.junbin.ib.enumeration.DoorType;
import org.junbin.ib.enumeration.RoofType;
import org.junbin.ib.enumeration.WallType;
import org.junbin.ib.enumeration.WindowType;
import org.junbin.ib.model.part.Door;
import org.junbin.ib.model.part.Roof;
import org.junbin.ib.model.part.Wall;
import org.junbin.ib.model.part.Window;

import java.util.NoSuchElementException;

/**
 * @Date : 2016-03-21 19:13
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public final class House {

    // required fields
    private Door door;
    private Roof roof;
    private Window window;
    private Wall wall;

    // optional fields
    private String description;

    private House(Door door, Roof roof, Window window, Wall wall, String description) {
        this.door = door;
        this.roof = roof;
        this.window = window;
        this.wall = wall;
        this.description = description;
    }

    public Door getDoor() {
        return door.clone();
    }

    public Roof getRoof() {
        return roof.clone();
    }

    public Window getWindow() {
        return window.clone();
    }

    public Wall getWall() {
        return wall.clone();
    }

    public String getDescription() {
        return description;
    }

    public String info() {
        return "House{" +
                "door=" + door.getType().getName() +
                ", roof=" + roof.getType().getName() +
                ", window=" + window.getType().getName() +
                ", wall=" + wall.getType().getName() +
                ", description='" + description + '\'' +
                '}';
    }

    public static class HouseBuilder {

        private Door door;
        private Window window;
        private Roof roof;
        private Wall wall;
        private String description = "";

        public HouseBuilder() {
        }

        public HouseBuilder door(Door door) {
            this.door = door.clone();
            return this;
        }

        public HouseBuilder window(Window window) {
            this.window = window.clone();
            return this;
        }

        public HouseBuilder roof(Roof roof) {
            this.roof = roof.clone();
            return this;
        }

        public HouseBuilder wall(String wallType) {
            for (WallType type : WallType.values()) {
                if (type.getName().equals(wallType)) {
                    this.wall = new Wall(type);
                    return this;
                }
            }
            throw new NoSuchElementException("不存在该类型的墙壁！");
        }

        public HouseBuilder door(String doorType) {
            for (DoorType type : DoorType.values()) {
                if (type.getName().equals(doorType)) {
                    this.door = new Door(type);
                    return this;
                }
            }
            throw new NoSuchElementException("不存在该类型的大门！");
        }

        public HouseBuilder window(String windowType) {
            for (WindowType type : WindowType.values()) {
                if (type.getName().equals(windowType)) {
                    this.window = new Window(type);
                    return this;
                }
            }
            throw new NoSuchElementException("不存在该类型的窗户！");
        }

        public HouseBuilder roof(String roofType) {
            for (RoofType type : RoofType.values()) {
                if (type.getName().equals(roofType)) {
                    this.roof = new Roof(type);
                    return this;
                }
            }
            throw new NoSuchElementException("不存在该类型的屋顶！");
        }

        public HouseBuilder wall(Wall wall) {
            this.wall = wall.clone();
            return this;
        }

        public HouseBuilder description(String option) {
            if (!StringUtils.isEmpty(option)) {
                this.description = option;
            }
            return this;
        }

        public House create() {
            return new House(door, roof, window, wall, description);
        }
    }
}
