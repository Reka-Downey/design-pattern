package org.junbin.ib.model.part;

import org.junbin.ib.enumeration.WindowType;
import org.junit.Test;

/**
 * @Date : 2016-03-21 19:32
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class TestWindow {

    @Test
    public void test() {
        Window window = new Window(WindowType.CRYSTAL);
        System.out.println("内存：" + window.toString() + " --> 类型：" + window.getType());
        window.setType(WindowType.PLASTIC);
        System.out.println("内存：" + window.toString() + " --> 类型：" + window.getType());
    }

    @Test
    public void testClone() {
        Window window = new Window(WindowType.GLASS);
        System.out.println("原始内存：" + window.toString() + " --> 类型：" + window.getType());
        Window clone = window.clone();
        System.out.println("克隆内存：" + clone.toString() + " --> 类型：" + clone.getType());
        // 由于没有实现equals方法和hashCode方法，所以返回false
        System.out.println("window.equals(clone) == " + window.equals(clone));
        clone.setType(WindowType.DIAMOND);
        System.out.println("修改克隆对象之后：");
        System.out.println("原始内存：" + window.toString() + " --> 类型：" + window.getType());
        System.out.println("克隆内存：" + clone.toString() + " --> 类型：" + clone.getType());
    }
}
