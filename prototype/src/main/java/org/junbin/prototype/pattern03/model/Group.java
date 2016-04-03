package org.junbin.prototype.pattern03.model;

import java.util.Objects;

/**
 * @Date : 2016-04-03 19:48
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class Group implements Cloneable {

    private String name;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return RecommandedCloneUtil.clone(this);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}
