package org.junbin.fm.factory;

import org.junbin.fm.model.SamSung;
import org.junbin.fm.model.Telephone;

/**
 * @Date : 2016-03-20 20:10
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 三星手机工厂
 */
public class SamSungFactory implements Factory {

    @Override
    public Telephone createProduct() {
        return new SamSung();
    }
}
