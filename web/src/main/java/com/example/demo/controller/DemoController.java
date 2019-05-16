package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: v_dengjianghua
 * @Date: 2019-05-15
 * @Time: 18:47
 * @Version 1.0
 * @Description 简要说明当前类的含义以及作用
 * @Tips To change this template : "File And Code Templates"
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("test")
    public String test() {
        return "Hello World";
    }

}
