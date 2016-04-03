package org.junbin.af.factory;

import org.junbin.af.enumerations.FactoryType;
import org.junbin.af.model.CPU;
import org.junbin.af.model.MainBoard;

/**
 * @Date : 2016-04-03 15:06
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public abstract class AbstractFactory {

    public static AbstractFactory factory(String name) {
        AbstractFactory factory = null;
        try {
            factory = (AbstractFactory) FactoryType.get(name).getClazz().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract CPU createCpu();

    public abstract MainBoard createMainBoard();
}
