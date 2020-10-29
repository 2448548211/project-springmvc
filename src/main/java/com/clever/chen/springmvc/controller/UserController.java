package com.clever.chen.springmvc.controller;

import com.clever.chen.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenWang
 * @className UserController
 * @date 2020/10/29 10:02
 * @since JDK 1.8
 */
/*一个控制器  一般就是一个功能模块
* 协议://域名/api/user/info
* */

@RestController
@RequestMapping("/user")
public class UserController {
    /*这两个注解都属于springmvc*/
    @GetMapping("/list")     //表示是get请求的映射
    @ResponseBody //自动转json
    public List<User> users(){
        return new ArrayList<>();
    }

    /**
     * REST 风格
     *
     * get      select
     * post     insert
     * put      update
     * delete   del
     *
     * */
    /*@RequestMapping(value="info",params = "id")*/
    @RequestMapping(value="/info",params = "id>1")
    //请求的参数中没有id直接报错-->错误的请求
    //还支持简单的逻辑判断
    @ResponseBody
    public User user(int id){
        return new User();
    }
    @RequestMapping(value="/save",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public String save(){
        return "1";
    }
    @RequestMapping(value="/accept",method = RequestMethod.POST,produces = "image/webp")
    @ResponseBody
    public String accept(){
        return "";
    }
    /**
     * 如何接受参数
     */
}
