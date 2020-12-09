package com.cykj.servlet;
import com.cykj.Dao.UserDao;
import com.cykj.Util.MD5Utils;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    UserDao userDao= (UserDao) ObjectFactory.getNewinstance("com.cykj.Dao.UserDao");
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginUsername=req.getParameter("loginUsername");
        String loginPassword=req.getParameter("loginPassword");
        String newPassword= MD5Utils.md5(loginPassword);
        User user=null;
        user=userDao.getUser(loginUsername,newPassword);
        if(user!=null){
            resp.getWriter().write("666");
        }else{
            resp.getWriter().write("222");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
