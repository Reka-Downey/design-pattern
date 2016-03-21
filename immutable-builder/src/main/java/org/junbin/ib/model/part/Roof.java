package org.junbin.ib.model.part;

import org.junbin.ib.enumeration.RoofType;

import java.io.Serializable;

/**
 * @Date : 2016-03-21 16:50
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：房屋
 */
public class Roof implements Cloneable, Serializable {


    private RoofType type;

    public Roof() {
    }

    public Roof(RoofType type) {
        this.type = type;
    }

    public RoofType getType() {
        return type;
    }

    public void setType(RoofType type) {
        this.type = type;
    }

    @Override
    public Roof clone() {
        try {
            return (Roof) super.clone();
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError(e);
        }
    }
}
