package org.junbin.ib.servlet;

import org.junbin.ib.enumeration.DoorType;
import org.junbin.ib.enumeration.RoofType;
import org.junbin.ib.enumeration.WallType;
import org.junbin.ib.enumeration.WindowType;
import org.junbin.ib.model.House;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumSet;

/**
 * @Date : 2016-03-21 20:01
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class LaunchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        EnumSet<DoorType> doorTypes = EnumSet.allOf(DoorType.class);
        EnumSet<WindowType> windowTypes = EnumSet.allOf(WindowType.class);
        EnumSet<WallType> wallTypes = EnumSet.allOf(WallType.class);
        EnumSet<RoofType> roofTypes = EnumSet.allOf(RoofType.class);
        req.setAttribute("doorTypes", doorTypes);
        req.setAttribute("windowTypes", windowTypes);
        req.setAttribute("wallTypes", wallTypes);
        req.setAttribute("roofTypes", roofTypes);
        req.getRequestDispatcher("/WEB-INF/view/launch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String doorType = req.getParameter("doorType");
        String windowType = req.getParameter("windowType");
        String wallType = req.getParameter("wallType");
        String roofType = req.getParameter("wallType");
        String description = req.getParameter("description");
        House house = new House.HouseBuilder().assembleDoor(doorType).assembleWall(wallType).assembleRoof(roofType)
                .assembleWindow(windowType).appendDescription(description).create();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("内存地址：" + house + "<br/> --> 信息：" + house.info());
    }
}
