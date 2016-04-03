package org.junbin.prototype.pattern01.model;

import com.google.common.base.Objects;

/**
 * @Date : 2016-04-03 18:36
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class User implements Cloneable {

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
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        User user = new User();
        user.setUsername(new String(this.username));
        user.setNickname(this.nickname);
        user.setAge(this.age);
        user.setGroup((Group) this.group.clone());
        return user;
    }


    /*
    //
    // 以下的equals和hashCode方法由Intellij IDEA模板方法生成
    //
    // IDEA智能提示equals和hashCode方法有五种生成方式：
    //
    // 一、由Intellij IDEA模板方法生成
    // 二、由Apache commons-lang的Equals和HashCodeBuilder生成
    // 三、由Apache commons-lang 3的Equals和HashCodeBuilder生成
    // 四、由Guava的Objects.equal和hashCode生成
    // 五、由JDK7的java.util.Objects.equals和hashCode生成
    //
*/


// ----------------------------------------------------------------------------
// ----------------/* 第一种：由Intellij IDEA模板方法生成 */-------------------

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;
        return !(group != null ? !group.equals(user.group) : user.group != null);

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }
*/

// ----------------------------------------------------------------------------


// ----------------------------------------------------------------------------
// ------/* 第二种：由Apache commons-lang的Equals和HashCodeBuilder生成 */------

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(age, user.age)
                .append(username, user.username)
                .append(nickname, user.nickname)
                .append(group, user.group)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(username)
                .append(nickname)
                .append(age)
                .append(group)
                .toHashCode();
    }
*/

// ----------------------------------------------------------------------------


// ----------------------------------------------------------------------------
// -----/* 第三种：由Apache commons-lang 3的Equals和HashCodeBuilder生成 */-----

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(age, user.age)
                .append(username, user.username)
                .append(nickname, user.nickname)
                .append(group, user.group)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(username)
                .append(nickname)
                .append(age)
                .append(group)
                .toHashCode();
    }
*/

// ----------------------------------------------------------------------------


// ----------------------------------------------------------------------------
// ------------/* 第四种：由Guava的Objects.equal和hashCode生成 */--------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equal(username, user.username) &&
                Objects.equal(nickname, user.nickname) &&
                Objects.equal(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username, nickname, age, group);
    }

// ----------------------------------------------------------------------------


// ----------------------------------------------------------------------------
// ---------/* 第五种：由JDK7的java.util.Objects.equals和hashCode生成 */-------

/*
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
*/

// ----------------------------------------------------------------------------

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
