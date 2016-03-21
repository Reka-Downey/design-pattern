package org.junbin.ib.model.part;

import org.junbin.ib.enumeration.DoorType;

import java.io.Serializable;

/**
 * @Date : 2016-03-21 16:53
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：大门  【如果要用到比较的话，还必须覆盖equals方法和hashCode方法】
 */
public class Door implements Cloneable, Serializable {

    private DoorType type;

    public Door() {
    }

    public Door(DoorType type) {
        this.type = type;
    }

    public DoorType getType() {
        return type;
    }

    public void setType(DoorType type) {
        this.type = type;
    }

    @Override
    public Door clone() {
        try {
            return (Door) super.clone();
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError(e);
        }
    }
}
