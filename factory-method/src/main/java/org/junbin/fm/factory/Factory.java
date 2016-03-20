package org.junbin.fm.factory;

import org.junbin.fm.model.Telephone;

/**
 * @Date : 2016-03-20 20:09
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 工厂接口
 */
public interface Factory {

    Telephone createProduct();
}
