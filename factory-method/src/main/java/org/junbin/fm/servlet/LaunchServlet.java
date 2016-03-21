package org.junbin.fm.servlet;

import org.junbin.fm.enumeration.TelephoneType;
import org.junbin.fm.factory.Factory;
import org.junbin.fm.factory.HuaWeiFactory;
import org.junbin.fm.factory.IPhoneFactory;
import org.junbin.fm.factory.SamSungFactory;
import org.junbin.fm.model.Telephone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumSet;
import java.util.NoSuchElementException;

/**
 * @Date : 2016-03-20 20:27
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class LaunchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EnumSet<TelephoneType> phoneTypeEnumSet = EnumSet.allOf(TelephoneType.class);
        req.setAttribute("phoneTypeSet", phoneTypeEnumSet);
        req.getRequestDispatcher("/WEB-INF/view/launch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phoneType = req.getParameter("phoneType");
        Factory factory = null;
        if (TelephoneType.IPHONE.getBrand().equals(phoneType)) {
            factory = new IPhoneFactory();
        } else if (TelephoneType.HUAWEI.getBrand().equals(phoneType)) {
            factory = new HuaWeiFactory();
        } else if (TelephoneType.SAMSUNG.getBrand().equals(phoneType)) {
            factory = new SamSungFactory();
        }
        if (factory == null) {
            throw new NoSuchElementException("尚未建立该产品的工厂！");
        }
        Telephone telephone = factory.createProduct();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("内存地址：" + telephone.toString() + "  -->  商标：" + telephone.getBrand());
    }
}
