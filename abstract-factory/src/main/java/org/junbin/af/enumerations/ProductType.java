package org.junbin.af.enumerations;

/**
 * @Date : 2016-04-03 15:49
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum ProductType {

    CPU("CPU"), MAIN_BOARD("MainBoard");

    private final String name;

    ProductType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
