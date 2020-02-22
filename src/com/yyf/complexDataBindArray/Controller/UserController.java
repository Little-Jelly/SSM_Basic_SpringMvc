package com.yyf.complexDataBindArray.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @RequestMapping("/toUser")
    public String selectUsers(){
        return "user";
    }

    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids){
        if(ids != null){
            for(Integer id : ids){
                System.out.println("删除了id为："+id+" 的用户！ ");
            }
        }else {
            System.out.println("ids=null");
        }
        return "success";
    }
}
