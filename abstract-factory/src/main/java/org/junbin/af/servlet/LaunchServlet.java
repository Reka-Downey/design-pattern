package org.junbin.af.servlet;

import org.junbin.af.enumerations.FactoryType;
import org.junbin.af.enumerations.ProductType;
import org.junbin.af.factory.AbstractFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @Date : 2016-04-03 15:23
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class LaunchServlet extends HttpServlet {

    private Set<String> factories;
    private Set<String> products;
    private AbstractFactory factory;

    @Override
    public void init() throws ServletException {
        super.init();
        factories = new HashSet<>();
        products = new HashSet<>();
        for (FactoryType type : FactoryType.values()) {
            factories.add(type.getName());
        }
        for (ProductType type : ProductType.values()) {
            products.add(type.getName());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("products", products);
        req.setAttribute("factories", factories);
        req.getRequestDispatcher("/WEB-INF/view/launch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        if ("factory".equals(type)) {
            String factoryName = req.getParameter("factoryName");
            factory = AbstractFactory.factory(factoryName);
        } else {
            String productName = req.getParameter("productName");
            String responseText;
            switch (productName) {
                case "CPU":
                    responseText = factory.createCpu().getCpuInfo();
                    break;
                case "MainBoard":
                    responseText = factory.createMainBoard().getMainBoardInfo();
                    break;
                default:
                    responseText = "不存在该产品类型！";
            }
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().write(responseText);
        }
    }
}
