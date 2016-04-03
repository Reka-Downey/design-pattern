package org.junbin.af.factory;

import org.junbin.af.model.*;

/**
 * @Date : 2016-04-03 15:08
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class IntelFactory extends AbstractFactory {

    @Override
    public CPU createCpu() {
        return new Intel();
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard();
    }
}
