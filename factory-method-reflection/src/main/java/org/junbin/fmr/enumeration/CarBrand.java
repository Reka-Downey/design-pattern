package org.junbin.fmr.enumeration;

import org.junbin.fmr.model.Bmw;
import org.junbin.fmr.model.Car;
import org.junbin.fmr.model.RollsRoyce;
import org.junbin.fmr.model.Volvo;

/**
 * @Date : 2016-03-21 12:16
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 汽车商家枚举
 */
public enum CarBrand {

    BMW("宝马", Bmw.class), VOLVO("沃尔沃", Volvo.class), ROLLS_ROYCE("劳斯莱斯", RollsRoyce.class);

    private String name;
    private Class<?> carClazz;

    <T extends Car> CarBrand(String name, Class<T> carClazz) {
        this.name = name;
        this.carClazz = carClazz;
    }

    @SuppressWarnings("unchecked")
    public <T extends Car> Class<T> getCarClazz() {
        return (Class<T>) carClazz;
    }

    public String getName() {
        return name;
    }
}
