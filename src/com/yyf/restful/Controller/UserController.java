package com.yyf.restful.Controller;

import com.yyf.restful.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @RequestMapping("/testJson")
    @ResponseBody // @ResponseBody用于直接返回User对象，当返回POJO对象时，会默认转换为JSON格式数据进行响应
    public User testJson(@RequestBody User user){  // @RequestBody用于将前端请求体重的JSON格式数据绑定到形参user上
        System.out.println(user);
        return user;
    }

    @RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable("id") String id){
        System.out.println("id="+id);
        User user = new User();

        if(id.equals("1234")){
            user.setUsername("tom");
        }
        return user;
    }

}
