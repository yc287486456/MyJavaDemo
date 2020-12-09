package com.cykj.servlet;

import com.alibaba.fastjson.JSON;
import com.cykj.Dao.AdminUserControlDao;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.PeopleSelect;
import com.cykj.bean.User;
import com.cykj.bean.UserParmars;
import org.apache.ibatis.session.RowBounds;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/AdminUserControlServlet")
public class AdminUserControlServlet extends HttpServlet {
    UserParmars userParmars=(UserParmars)ObjectFactory.getNewinstance("com.cykj.bean.UserParmars");
    AdminUserControlDao adminUserControlDao= (AdminUserControlDao) ObjectFactory.getNewinstance("com.cykj.Dao.AdminUserControlDao");
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page=request.getParameter("page");
        int newPage=Integer.parseInt(page);
        String limit=request.getParameter("limit");
        //开始时间
        String beginTime=request.getParameter("beginTime");
        //用户名
        String  demoReload=request.getParameter("demoReload");
        //结束时间
        String  endTime=request.getParameter("endTime");
        Map<String,String> hasMap=new HashMap<>();
        hasMap.put("beginTime",beginTime);
        hasMap.put("demoReload",demoReload);
        hasMap.put("endTime",endTime);

        int newLimit=Integer.parseInt(limit);
        RowBounds rb=new RowBounds((newPage-1)*newLimit,newLimit);
        List<User> users=adminUserControlDao.userList(rb,hasMap);
        Map<String,Object> map= new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",adminUserControlDao.tableCount(hasMap));
        map.put("data",users);
        response.getWriter().write(JSON.toJSONString(map));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
