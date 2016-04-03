package org.junbin.prototype.pattern02.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @Date : 2016-04-03 20:07
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class TestClone02 {

    private Group group;
    private User user;

    @Before
    public void setUp() {
        group = new Group("西经组");
        user = new User("ts", "唐僧", 5000, group);
    }

    @Test
    public void test() throws CloneNotSupportedException {
        User u = (User) user.clone();
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
