package com.yyf.simpleDataBind.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping(value = "/selectUser")
    public String selectUser(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("id="+id);
        return "success";
    }

    @RequestMapping(value = "/selectUser2")
    public String selectUser2(Integer id){
        System.out.println("id="+id);
        return "success";
    }

    @RequestMapping(value = "/selectUser3")
    public String selectUser3(@RequestParam(value = "user_id")Integer id){
        System.out.println("id="+id);
        return "success";
    }
}
