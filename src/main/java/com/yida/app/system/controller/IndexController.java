package com.yida.app.system.controller;

import com.yida.app.system.domain.User;
import com.yida.app.system.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhouk on 2015/11/17.
 */
@Controller
@RequestMapping
public class IndexController {

    private @Resource IUserService userService;

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "你好");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/showUsers")
    public User showUsers() {
        User user = userService.getUser();
        return user ;
    }

}
