package org.junbin.fm.factory;

import org.junbin.fm.model.IPhone;
import org.junbin.fm.model.Telephone;

/**
 * @Date : 2016-03-20 20:10
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 产品工厂——苹果
 */
public class IPhoneFactory implements Factory {

    @Override
    public Telephone createProduct() {
        return new IPhone();
    }
}
