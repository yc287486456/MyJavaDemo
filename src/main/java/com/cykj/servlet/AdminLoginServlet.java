package com.cykj.servlet;

import com.cykj.Dao.AdminUserDao;
import com.cykj.Util.MD5Utils;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.AdminUser;
import com.cykj.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    AdminUser adminUser=(AdminUser) ObjectFactory.getNewinstance("com.cykj.bean.AdminUser");
    AdminUserDao adminUserDao=(AdminUserDao) ObjectFactory.getNewinstance("com.cykj.Dao.AdminUserDao");
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginUsername=req.getParameter("loginUsername");
        String loginPassword=req.getParameter("loginPassword");
//        String newPassword= MD5Utils.md5(loginPassword);
        adminUser.setAdminAccount(loginUsername);
        adminUser.setAdminPassword(loginPassword);
        AdminUser admin=null;
        admin=adminUserDao.login(adminUser);
        if(admin!=null){
            resp.getWriter().write("666");
        }else{
            resp.getWriter().write("222");
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
