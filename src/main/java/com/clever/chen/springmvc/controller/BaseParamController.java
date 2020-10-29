package com.clever.chen.springmvc.controller;

import com.clever.chen.springmvc.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.util.Map;

/**
 * @author ChenWang
 * @className BaseParamController
 * @date 2020/10/29 11:13
 * @since JDK 1.8
 */
/*
 * 如何接受参数
 * <1> 基本类型
 * <2> 对象（简单对象  复杂对象）
 * <3> map (数组   集合List)
 * <4> 时间
 * */
@Controller
public class BaseParamController {
    // xxx/test1?username="1111"&id=1
    //基本类型参数
    @GetMapping("/test1")
    @ResponseBody
    public String test(String username,int id){
        System.out.println(username);
        System.out.println(id);
        return username;
    }
    //xxx/test2?username="1111"&id=1
    //普通对象
    //对象的属性值为键
    @GetMapping("/test2")
    @ResponseBody
    public String test2(UserDto userDto){
        System.out.println(userDto);
        return "接受对象参数";
    }
    //xxx/test3?username="1111"&id=1&address.id=1&address.city="guangzhou"
    /**
     * 复杂对象（嵌套对象建议使用json格式的数据上传）
     *
     *
     */
    @GetMapping("/test3")
    @ResponseBody
    public String test3(UserDto userDto){
        System.out.println(userDto);
        System.out.println(userDto.getAddressDto());
        return "接受复杂对象参数";
    }

    //xxx/test4?arrs=1&arrs=2&arrs=3
    /**
     * 数据类型的key就是参数名
     */
    @GetMapping("/test4")
    @ResponseBody
    public String test4(int[] arrs){
        System.out.println(arrs);
        return "接受数组参数";
    }

    //xxx/test5?
    /**
     * 直接使用map的key=value
     * key=value
     */
    @GetMapping("/test5")
    @ResponseBody
    public String test5(Map<String,String> map){
        System.out.println(map.toString());
        return "接受映射参数";
    }


    //xxx/test6?list=1&list=2
    //传对象集合
    //xxx/test6?list.addr=1&list=2
    /**
     * List原生必须配合@RequestParam使用，否则报错
     * 或者配合对象使用
     */
    @GetMapping("/test6")
    @ResponseBody
    /*直接使用报错without @RequestParam 注解
    public String test6(List<String> list){
        System.out.println(list.toString());
        return "接受集合参数";
    }*/
    public String test6(UserDto userDto){
        System.out.println(userDto.getList());
        return "接受集合参数";
    }

    /**
     * 接受内置对象参数
     * 还可以接受原生的HttpServletRequest 和
     * HttpServletResponse对象
     * HttpSession对象  支持servlet内置对象
     * 前后端不分离，支持Model ,ModelMap
     */
    @GetMapping("/test7")
    @ResponseBody
    public String test7(HttpServletRequest request
            , HttpServletResponse response
            , HttpSession session
            , Model model
            , ModelMap map){

        System.out.println(request.toString());
        System.out.println(response.toString());
        return "接受内置对象参数";
    }
    /**
     * 日期类型
     * 涉及第三方工具转换字符串为日期格式
     */
}


