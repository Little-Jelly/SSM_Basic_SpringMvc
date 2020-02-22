package com.yyf.annotationApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/thirdController")
public class FirstController {

    @RequestMapping(value = "/hello")
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response,
                                Model model){

        model.addAttribute("msg", "这是我的第一个Spring MVC程序测试");
        return "first";
    }
}
