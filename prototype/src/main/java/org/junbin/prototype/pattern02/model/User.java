package org.junbin.prototype.pattern02.model;

import java.io.*;
import java.util.Objects;

/**
 * @Date : 2016-04-03 19:38
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class User implements Serializable, Cloneable {

    private String username;
    private String nickname;
    private int age;
    private Group group;

    public User() {
    }

    public User(String username, String nickname, int age, Group group) {
        this.username = username;
        this.nickname = nickname;
        this.age = age;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(username, user.username) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, nickname, age, group);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return CloneUtil.clone(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", group=" + group.toString() +
                '}';
    }
}
