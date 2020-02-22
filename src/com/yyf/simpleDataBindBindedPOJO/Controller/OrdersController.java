package com.yyf.simpleDataBindBindedPOJO.Controller;

import com.yyf.simpleDataBindBindedPOJO.POJO.Orders;
import com.yyf.simpleDataBindBindedPOJO.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {

    @RequestMapping(value = "/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }

    @RequestMapping(value = "/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer orderid = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("orderId="+orderid);
        System.out.println("username="+username);
        return "success";
    }
}
