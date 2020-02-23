package com.yyf.interceptors.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("Hello");
        return "success";
    }
}
