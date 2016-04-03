package org.junbin.af.model;

/**
 * @Date : 2016-04-03 15:04
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class AmdMainBoard implements MainBoard {

    @Override
    public String getMainBoardInfo() {
        return "内存地址：" + this.toString() + " ---> 主板类型：AMD";
    }
}
