package org.junbin.ca.servlet;

import org.junbin.ca.adapter.StringAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date : 2016-04-03 13:58
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class LaunchServlet extends HttpServlet {

    private StringAdapter adapter;

    @Override
    public void init() throws ServletException {
        super.init();
//        new ArrayList<>(Arrays.asList(System.getProperty("java.class.path").split(";"))).stream().forEach(System.out::println);
        adapter = new StringAdapter();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/launch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String source = req.getParameter("source");
        String reverse = adapter.reverse(source);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("原串：" + source + " --> 反转串：" + reverse);
    }
}
