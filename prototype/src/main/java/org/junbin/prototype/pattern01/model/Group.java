package org.junbin.prototype.pattern01.model;

import java.nio.charset.StandardCharsets;

/**
 * @Date : 2016-04-03 18:32
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

        return !(name != null ? !name.equals(group.name) : group.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        Group group = new Group();
        group.setName(new String(this.name.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
        return group;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}
