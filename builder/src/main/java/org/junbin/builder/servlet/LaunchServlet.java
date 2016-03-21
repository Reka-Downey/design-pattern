package org.junbin.builder.servlet;

import org.junbin.builder.enumeration.BuilderType;
import org.junbin.builder.model.Builder;
import org.junbin.builder.model.Director;
import org.junbin.builder.model.House;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumSet;

/**
 * @Date : 2016-03-21 17:54
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class LaunchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EnumSet<BuilderType> builderTypeEnumSet = EnumSet.allOf(BuilderType.class);
        req.setAttribute("builderType", builderTypeEnumSet);
        req.getRequestDispatcher("/WEB-INF/view/launch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String builderType = req.getParameter("builderType");
        try {
            for (BuilderType type : BuilderType.values()) {
                if (type.getName().equals(builderType)) {
                    Builder builder = type.getBuilderClazz().newInstance();
                    Director director = new Director(builder);
                    House house = director.buildHouse();
                    resp.setContentType("text/html;charset=UTF-8");
                    resp.getWriter().write("内存地址：" + house.toString() + "  -->  房屋信息：" + house.info());
                }
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
