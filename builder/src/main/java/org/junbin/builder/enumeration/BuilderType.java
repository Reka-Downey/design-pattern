package org.junbin.builder.enumeration;

import org.junbin.builder.model.Builder;
import org.junbin.builder.model.HouseBuilder01;
import org.junbin.builder.model.HouseBuilder02;

/**
 * @Date : 2016-03-21 17:56
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum BuilderType {

    COMON("普通", HouseBuilder01.class), LUXURY("豪华", HouseBuilder02.class);

    private String name;
    private Class<?> builderClazz;

    BuilderType(String name, Class<?> builderClazz) {
        this.name = name;
        this.builderClazz = builderClazz;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unchecked")
    public <T extends Builder> Class<T> getBuilderClazz() {
        return (Class<T>) builderClazz;
    }

}
