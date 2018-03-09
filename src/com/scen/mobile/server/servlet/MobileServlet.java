package com.scen.mobile.server.servlet;

import com.scen.mobile.server.MobileInterFace;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Scen
 * @date 2018/3/9
 */
@WebServlet(name = "mobileServlet",urlPatterns = "*.action")
public class MobileServlet extends HttpServlet {

    private MobileInterFace mobileServer;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String phoneNum = request.getParameter("phoneNum");
        if (null != phoneNum && !"".equals(phoneNum)) {
            ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
            mobileServer = (MobileInterFace) context.getBean("mobileServer");
            String result = mobileServer.queryMobile(phoneNum);
            request.setAttribute("result",result);
        }
        request.getRequestDispatcher("/WEB-INF/jsp/queryMobile.jsp").forward(request, response);
    }
}
