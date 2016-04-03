package org.junbin.oa.adapter;


import org.junbin.oa.adaptee.StringHandler;
import org.junbin.oa.interfaces.Target;

/**
 * @Date : 2016-04-03 14:33
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class StringAdapter implements Target {

    private StringHandler handler;

    public StringAdapter() {
        this.handler = new StringHandler();
    }

    @Override
    public String reverse(String source) {
        return handler.reverse(source);
    }
}
