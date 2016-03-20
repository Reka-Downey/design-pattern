package org.junbin.fm.enumeration;

/**
 * @Date : 2016-03-20 20:22
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum TelephoneType {

    IPHONE("iPhone"), HUAWEI("HUAWEI"), SAMSUNG("SAMSUNG");

    private String brand;

    private TelephoneType(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

}
