package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @项目名：  JspDemo 
 *  @包名：    com.itheima.controller
 *  @文件名:   UserController
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/5 18:43
 *  @描述：    TODO
 */
@RestController
public class UserController {

    @RequestMapping("save")
    public String save(){

        return "save success~!~!";
    }
}
