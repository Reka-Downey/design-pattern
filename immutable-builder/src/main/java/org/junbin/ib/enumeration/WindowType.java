package org.junbin.ib.enumeration;

/**
 * @Date : 2016-03-21 18:29
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum WindowType {

    PLASTIC("塑料"), GLASS("玻璃"), CRYSTAL("水晶"), DIAMOND("钻石"), PULL_PUSH("推拉窗");

    private String name;

    WindowType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
