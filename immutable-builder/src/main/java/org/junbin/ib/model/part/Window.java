package org.junbin.ib.model.part;

import org.junbin.ib.enumeration.WindowType;

import java.io.Serializable;

/**
 * @Date : 2016-03-21 16:52
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 部件类：窗户
 */
public class Window implements Cloneable,Serializable{

    private WindowType type;

    public Window() {
    }

    public Window(WindowType type) {
        this.type = type;
    }

    public WindowType getType() {
        return type;
    }

    public void setType(WindowType type) {
        this.type = type;
    }

    @Override
    public Window clone() {
        try {
            return (Window) super.clone();
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError(e);
        }
    }
}
