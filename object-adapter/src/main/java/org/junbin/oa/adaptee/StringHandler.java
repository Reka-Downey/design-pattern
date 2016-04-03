package org.junbin.oa.adaptee;

/**
 * @Date : 2016-04-03 14:28
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class StringHandler {

    public String reverse(String source) {
        char[] array = source.toCharArray();
        StringBuilder builder = new StringBuilder(array.length);
        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
        }
        return builder.toString();
    }

}
