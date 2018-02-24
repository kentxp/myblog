package com.wanghaorui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangfei on 2018/2/22.
 */
@Controller
public class SigninController {
    int i = 1;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String hello(Model model) {
        i = i + 1;
        model.addAttribute("num",i);
        return "signin";
    }

}
