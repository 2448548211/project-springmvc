package com.clever.chen.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ChenWang
 * @className RequestHeaderController
 * @date 2020/10/29 14:57
 * @since JDK 1.8
 */

/**
 * 一个请求数据里有
 * 请求行
 * 请求头
 * 请求体
 */
@Controller
public class RequestHeaderController {
    @GetMapping("h1")
    @ResponseBody
    /**
     * @RequestHeader
     * 做认证用的 jwt 替换session cookie
     */
    //这里不支持中文，可能是编码集的问题
    public String test1(@RequestHeader String token){
        System.out.println(token);
        return "请求头传参数";
    }


    @GetMapping("h2")
    @ResponseBody
    /**
     * @CookieValue
     * 接受浏览器发来的cookie
     * 做认证用的 jwt 替换session cookie
     */
    public String test2(@CookieValue("usercookie") String token){
        System.out.println(token);
        return "请求cookie参数";
    }

}
