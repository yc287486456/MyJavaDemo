package com.cykj.servlet;

import com.alibaba.fastjson.JSON;
import com.cykj.Dao.PeopleSelectDao;
import com.cykj.Dao.UserDao;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.Page;
import com.cykj.bean.PeopleSelect;
import com.cykj.bean.User;
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

@WebServlet("/PeopleSelectServlet")
public class PeopleSelectServlet extends HttpServlet {
    PeopleSelectDao PeopleSelectDao= (PeopleSelectDao) ObjectFactory.getNewinstance("com.cykj.Dao.PeopleSelectDao");
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page=request.getParameter("page");
        int newPage=Integer.parseInt(page);
        String limit=request.getParameter("limit");
        int newLimit=Integer.parseInt(limit);
        RowBounds rb=new RowBounds((newPage-1)*newLimit,newLimit);
             List<PeopleSelect> peopleSelectList=PeopleSelectDao.peopleSelectList(rb);
        Map<String,Object> map= new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",PeopleSelectDao.peopleCount());
        map.put("data",peopleSelectList);
        response.getWriter().write(JSON.toJSONString(map));







    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
