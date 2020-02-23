package com.yyf.interceptorLogin.Controller;

import com.yyf.interceptorLogin.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        String username = user.getUsername();
        String password = user.getPassword();

        if(username!=null && username.equals("xiaoxue") && password != null && password.equals("123456")){
            session.setAttribute("USER_SESSION", user);
            return "redirect:main";
        }
        model.addAttribute("msg", "用户或密码错误，请重新登录！");
        return "login";
    }

    @RequestMapping(value = "/main")
    public String toMain(){
        return "main";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }
}
