package com.cykj.servlet;

import com.cykj.Dao.UserDao;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegsiterServlet")
public class RegsiterServlet extends HttpServlet {
    UserDao userDao= (UserDao) ObjectFactory.getNewinstance("com.cykj.Dao.UserDao");

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //注册查询账号
        String uAccount=request.getParameter("user");
        User user=null;
       user=userDao.selectUserAccount(uAccount);
       if(user==null){
           response.getWriter().write("1");
       }else {
           response.getWriter().write("2");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
