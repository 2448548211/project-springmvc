package com.clever.chen.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ChenWang
 * @className JspController
 * @date 2020/10/29 16:10
 * @since JDK 1.8
 */
//前后端不分离
@Controller
public class JspController {
    //前缀+控制器返回的名称+后缀名
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    //spring框架下的前后端不分离
    @GetMapping("/index1")
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","admin");
        //这里设置jsp的名称
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/index2")
    public String index2(ModelMap modelMap){
        return "index";
    }
}
