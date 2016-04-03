package org.junbin.af.factory;

import org.junbin.af.model.*;

/**
 * @Date : 2016-04-03 15:09
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class AmdFactory extends AbstractFactory {

    @Override
    public CPU createCpu() {
        return new Amd();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard();
    }
}
