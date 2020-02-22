package com.yyf.simpleDataBindBindedPOJO.Controller;

import com.yyf.simpleDataBindBindedPOJO.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/registerUser")
    public String registerUser(HttpServletRequest request, User user){
        String mymethod = request.getMethod();
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("method is="+mymethod);
        System.out.println("username="+username);
        System.out.println("password="+password);
        return "success";
    }
}
