package org.junbin.af.model;

/**
 * @Date : 2016-04-03 15:03
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class Amd implements CPU {

    @Override
    public String getCpuInfo() {
        return "内存地址：" + this.toString() + " ---> CPU类型：AMD";
    }
}
