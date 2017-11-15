package org.qf.action;

import org.apache.catalina.User;
import org.qf.pojo.UserInfo;
import org.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoAction {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/addUser")
    public String addUser(){
        UserInfo user = new UserInfo();
        user.setUsername("✿猴子");
        user.setPassword("123");
        userInfoService.addUser(user);
        return "findById";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public UserInfo findById(){
        UserInfo id = userInfoService.findById(1L);
        return id;
    }

    @RequestMapping("/updateUser")
    public String updateUser(UserInfo user){
        user.setId(1L);
        user.setUsername("凸(艹皿艹 )");
        userInfoService.updateUser(user);
        return "findById";
    }

    @RequestMapping("/delUser")
    @ResponseBody
    public String delUser(){
        userInfoService.del(1L);
        return "ok";
    }
}
