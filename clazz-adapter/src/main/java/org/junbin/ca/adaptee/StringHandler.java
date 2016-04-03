package org.junbin.ca.adaptee;

/**
 * @Date : 2016-04-03 13:39
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class StringHandler {

    public String reverse(String source) {
        char[] array = source.toCharArray();
        char temp;
        for (int i = 0, len = array.length, j = len - 1, half = len / 2; i < half; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return new String(array);
    }

}
