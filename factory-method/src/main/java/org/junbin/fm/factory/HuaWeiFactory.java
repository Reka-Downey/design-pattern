package org.junbin.fm.factory;

import org.junbin.fm.model.HuaWei;
import org.junbin.fm.model.Telephone;

/**
 * @Date : 2016-03-20 20:20
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品工厂——华为
 */
public class HuaWeiFactory implements Factory {

    @Override
    public Telephone createProduct() {
        return new HuaWei();
    }
}
