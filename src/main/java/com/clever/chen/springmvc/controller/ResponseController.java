package com.clever.chen.springmvc.controller;

import com.clever.chen.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenWang
 * @className ResponseController
 * @date 2020/10/29 15:24
 * @since JDK 1.8
 */
/**
 * 发展史 REST2000提出
 * 移动客户端出现前
 * 程序员开发：前端+后台 +数据+部署    浏览器兼容性极差
 *  移动端出现后 REST重视起来
 *  后台+前端  + ios 安卓    前后端开始分离--》URL规范
 * REST 定义路径规范 成为了主流
 * 路径尽量使用名词
 * api/v1/user/login
 * api/v1/user/register
 * api/v1/user/list?page=1&size=2  get 静态路径
 * api/v1/user/list/1/10 动态路径
 *
 * RPC          dobbo
 * REST软件架构风格 表示对路径进行规范 微服务 spring cloud 全前后端分离
 *
 *
 * 前后端不分离   @Controller(默认的)  会有模板转换数据 + @ResponseBody 传json数据回前端
 * 前后端分离  @RestController == @Controller+ @ResponseBody
 *
 *
 * */
@RestController
@RequestMapping("user1")
public class ResponseController {
    //api/v1/user1/detail/

    //给移动端传数据的时候使用
    //动态路径使用
    //常见应用场景 分页功能  太多参数不要这样写（2~3个参数左右）
    /**
     * mapping 声明{变量}
     * 在参数中 使用 @PathVariable注解
     */
    @GetMapping("/detail/{id}")
    public User detail(@PathVariable int id){
        return new User();
    }
    @GetMapping("/list/{page}/{size}")
    public String list(@PathVariable int page,@PathVariable int size){
        return "动态路径";
    }
}
