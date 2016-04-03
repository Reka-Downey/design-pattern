package org.junbin.af.model;

/**
 * @Date : 2016-04-03 15:04
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class Intel implements CPU {

    @Override
    public String getCpuInfo() {
        return "内存地址：" + this.toString() + " ---> CPU类型：INTEL";
    }
}
