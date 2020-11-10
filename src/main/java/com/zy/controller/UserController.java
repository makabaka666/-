package com.zy.controller;

import com.zy.pojo.User;
import com.zy.service.Impl.UserServiceImpl;
import com.zy.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet("/user")
public class UserController extends BaseController{
    private UserService userService = new UserServiceImpl();

    public String noparam(HttpServletRequest request, HttpServletResponse response){
        List<User> list = userService.selectAll();
        request.setAttribute("list",list);
        return "All";
    }
    public String selectOne(HttpServletRequest request, HttpServletResponse response){
        int uid = Integer.valueOf(request.getParameter("u_id"));
        User user = userService.selectOne(uid);
        request.setAttribute("user",user);
        return "One";
    }
    public String update(HttpServletRequest request, HttpServletResponse response){
        int res = 0;
        String uid = request.getParameter("id");
        String name = request.getParameter("u_name");
        try {
            name=new String(name.getBytes("iso-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String sex = request.getParameter("u_sex");
        String email = request.getParameter("u_email");
        User user = new User(null,name,sex,email);
        if (uid != "") {
            int ids = Integer.valueOf(uid);
            user.setU_id(ids);
            res = userService.update(user);
            return this.noparam(request, response);
        } else {
            user = userService.insert(user);
            return this.noparam(request, response);
        }
    }
    public String delete(HttpServletRequest request, HttpServletResponse response){
        int uid = Integer.valueOf(request.getParameter("u_id"));
        int status = userService.delete(uid);
        if(status>0){
            return this.noparam(request,response);
        }else{
            return "";
        }
    }
}
