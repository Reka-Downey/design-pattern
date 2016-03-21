package org.junbin.fmr.factory;

import org.junbin.fmr.model.Car;

/**
 * @Date : 2016-03-21 12:27
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 反射产品工厂类
 */
public class ReflectionFactory implements Factory {

    @Override
    public <T extends Car> Car create(Class<T> carClazz) {
//        System.out.println(carClazz.getName());
        T t = null;
        try {
            //noinspection unchecked
            t = (T) Class.forName(carClazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }
}
