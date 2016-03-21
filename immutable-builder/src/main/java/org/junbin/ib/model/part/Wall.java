package org.junbin.ib.model.part;

import org.junbin.ib.enumeration.WallType;

import java.io.Serializable;

/**
 * @Date : 2016-03-21 16:51
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：墙壁
 */
public class Wall implements Cloneable,Serializable{

    private WallType type;

    public Wall() {
    }

    public Wall(WallType type) {
        this.type = type;
    }

    public WallType getType() {
        return type;
    }

    public void setType(WallType type) {
        this.type = type;
    }

    @Override
    public Wall clone() {
        try {
            return (Wall) super.clone();
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError(e);
        }
    }
}
