package org.junbin.af.enumerations;

import org.junbin.af.factory.AmdFactory;
import org.junbin.af.factory.IntelFactory;

import java.util.NoSuchElementException;

/**
 * @Date : 2016-04-03 15:17
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public enum FactoryType {

    INTEL("Intel", IntelFactory.class), AMD("amd", AmdFactory.class);

    private final String name;
    private final Class<?> clazz;

    FactoryType(String name, Class<?> clazz) {
        this.name = name;
        this.clazz = clazz;
    }


    public String getName() {
        return name;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public static FactoryType get(String name) {
        for (FactoryType type : FactoryType.values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        throw new NoSuchElementException("不存在该工厂！");
    }
}
