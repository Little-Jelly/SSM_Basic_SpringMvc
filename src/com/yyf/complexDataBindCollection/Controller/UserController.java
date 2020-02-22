package com.yyf.complexDataBindCollection.Controller;

import com.yyf.complexDataBindCollection.vo.UserVO;
import com.yyf.complexDataBindCollection.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserController {

    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }

    @RequestMapping("/editUsers")
    public String editUsers(UserVO userList){
        List<User> users = userList.getUsers();
        for(User user : users){
            if(user.getId() != null){
                System.out.println("修改了id为"+user.getId()+"的用户名为："+user.getUsername());
            }
        }
        return "success";
    }
}
