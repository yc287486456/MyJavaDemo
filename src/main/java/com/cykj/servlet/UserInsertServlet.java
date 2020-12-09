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

@WebServlet("/UserInsertServlet")
public class UserInsertServlet extends HttpServlet {
    User user = (User) ObjectFactory.getNewinstance("com.cykj.bean.User");
    UserDao userDao= (UserDao) ObjectFactory.getNewinstance("com.cykj.Dao.UserDao");
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uAccount=request.getParameter("user");
        String passWord=request.getParameter("pwd");
        String newPassword= MD5Utils.md5(passWord);
        String sex=request.getParameter("sex");
        String educational=request.getParameter("educational");
        String job=request.getParameter("job");
        String phoneNumber=request.getParameter("phoneNumber");
        long newPhoneNumber=Long.parseLong(phoneNumber);
        String Email=request.getParameter("Email");
        user.setAccount(uAccount);
        user.setPassword(newPassword);
        user.setEducational(educational);
        user.setSex(sex);
        user.setJob(job);
        user.setPhoneNumber(newPhoneNumber);
        user.setEmail(Email);
        user.setUserState(1);
        int flag=userDao.insertUser(user);
        if(flag>0){
            response.getWriter().write("1");
        }else{
            response.getWriter().write("2");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
