package com.yyf.core.Controller_Annotation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/secondController")
public class SecondController {

    @RequestMapping(value="/test")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "this is the second");
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }

    @RequestMapping(value = "test2")
    public String test_multiHandlers(HttpServletRequest request,
                       HttpServletResponse response,
                       Model model){
        model.addAttribute("msg", "这是我的第一个Spring MVC 程序");
        return "/WEB-INF/jsp/first.jsp";
    }

    @RequestMapping(value = "test_redirect")
    public String test_redirect(HttpServletRequest request,
                                HttpServletResponse response,
                                Model model){
        return "redirect:queryUser";
    }

    @RequestMapping(value = "queryUser")
    public String test_redirect_2(HttpServletRequest request,
                                  HttpServletResponse response,
                                  Model model){
        model.addAttribute("msg", "这里是redirect后的页面");
        return "/WEB-INF/jsp/first.jsp";
    }
}
