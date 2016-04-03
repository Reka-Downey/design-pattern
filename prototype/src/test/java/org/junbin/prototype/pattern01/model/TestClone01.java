package org.junbin.prototype.pattern01.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @Date : 2016-04-03 20:03
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class TestClone01 {

    private Group group;
    private User user;

    @Before
    public void setUp() {
        group = new Group("西经组");
        user = new User("ts", "唐僧", 5000, group);
    }

    @Test
    public void test() throws CloneNotSupportedException {
        System.out.println(user);
        User u = (User) user.clone();
        System.out.println(u);
        assertEquals(user.toString(), u.toString());
        assertTrue(user.equals(u));
        assertTrue(user.getGroup().equals(u.getGroup()));
    }

    @After
    public void tearDown() {
        group = null;
        user = null;
    }

}
