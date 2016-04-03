package org.junbin.sf.servlet;

import org.junbin.sf.enumeration.FruitType;
import org.junbin.sf.factory.FruitFactory;
import org.junbin.af.model.Fruit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date : 2016-03-20 18:18
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro : 应用登入Servlet
 */
public class LaunchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("fruitTypes", FruitType.values());
        req.getRequestDispatcher("/WEB-INF/view/simpleFactory.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int value = Integer.parseInt(req.getParameter("value"));
        Fruit fruit = FruitFactory.createFruit(value);
        String responseText = "内存地址：" + fruit.toString() + "  ——》  描述：" + fruit.getDescription();
        resp.getWriter().write(responseText);
    }
}
