package com.yyf.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("lalalal");
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "this is the first");
        mav.setViewName("first");
        return mav;
    }
}
