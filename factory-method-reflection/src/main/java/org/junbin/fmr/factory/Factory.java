package org.junbin.fmr.factory;

import org.junbin.fmr.model.Car;

/**
 * @Date : 2016-03-21 12:25
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 工厂接口
 */
public interface Factory {

    public abstract <T extends Car> Car create(Class<T> carClazz);
}
