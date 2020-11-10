package com.zy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action= req.getParameter("action");
        if (action==null){
            action = "noparam";
        }
        try {
            //获得方法
            Method method= this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            //调用方法
            Object obj= method.invoke(this,req,resp);
            if(obj!=null && obj instanceof String){
                String page=(String)obj;
                //判断是否是异步
                if(page.startsWith("ajax")){
                    //异步返回
                    PrintWriter writer = resp.getWriter();//获得一个字符输出流
                    writer.write(page.substring(5));//ajax:ok
                    writer.flush();
                    return ;
                }else if(page.startsWith("redirect")){
                    //重定向到页面
                    resp.sendRedirect(page.substring(9)+".jsp");//"redirect:load"
                    return;
                }else if(page.startsWith("re")){
                    //重定向到控制器
                    resp.sendRedirect(page.substring(3));//"re:load"
                    return;
                }
                //请求转发
                req.getRequestDispatcher(page+".jsp").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
