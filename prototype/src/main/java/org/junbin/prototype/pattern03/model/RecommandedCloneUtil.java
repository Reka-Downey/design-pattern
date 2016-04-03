package org.junbin.prototype.pattern03.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Date : 2016-04-03 19:50
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class RecommandedCloneUtil {

    private final static Gson gson = new GsonBuilder().serializeNulls().create();

    public static Object clone(Object o) {
        return gson.fromJson(gson.toJson(o), o.getClass());
    }
}
