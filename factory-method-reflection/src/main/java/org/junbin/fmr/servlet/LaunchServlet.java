package org.junbin.fmr.servlet;

import org.junbin.fmr.enumeration.CarBrand;
import org.junbin.fmr.factory.Factory;
import org.junbin.fmr.factory.ReflectionFactory;
import org.junbin.fmr.model.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date : 2016-03-20 21:18
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class LaunchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarBrand[] carBrands = CarBrand.values();
        req.setAttribute("carBrands", carBrands);
        req.getRequestDispatcher("/WEB-INF/view/launch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brand = req.getParameter("brand");
        Factory factory = new ReflectionFactory();
        for (CarBrand carBrand : CarBrand.values()) {
            if (carBrand.getName().equals(brand)) {
                Car car = factory.create(carBrand.getCarClazz());
                resp.getWriter().write("内存地址：" + car.toString() + " --> 商标：" + car.getBrand());
            }
        }
    }
}
