package com.clever.chen.springmvc.controller;

import com.clever.chen.springmvc.dto.UserRequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ChenWang
 * @className RequestParamController
 * @date 2020/10/29 14:12
 * @since JDK 1.8
 */
@Controller
public class RequestParamController {
    //大型的项目中
    //后台开发可以有 java  php python
    //命名习惯冲突 user_name
    //requeired表示是否是必要参数
    //  /t1和t1是同样的效果
    @GetMapping("/t1")
    @ResponseBody
    public String test1(@RequestParam(value = "user_name",required = true) String username){
        System.out.println(username);
        return "@RequestParam使用别名解决命名冲突";
    }
    /**
     * @RequestParam
     * 属性      required 默认为true 表示必传参数
     *          value/name = ""  别名,就是前端传到后台时所用的key，
     *          当客户端的参数跟方法的参数命名不一致时可以使用
     *          defaultValue 给参数默认值
     * */
    @PostMapping("/t2")
    @ResponseBody
    public String test2(@RequestParam(required = true) String name,
                        @RequestParam(required = false,defaultValue = "1") int page,
                        @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println(name);
        System.out.println(page);
        System.out.println(size);
        return "@RequestParam的注解使用给默认值";
    }


    /**
     * 使用@RequestBody 一般结合post请求
     */
    //只有post有请求体
    @PostMapping("/t3")
    @ResponseBody
    public String test3(@RequestParam UserRequestParam userRequestParam){
        return "@RequestParam的注解使用给默认值";
    }
}
