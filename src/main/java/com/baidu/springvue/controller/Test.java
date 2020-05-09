package com.baidu.springvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Test {
    @PostMapping("test")
    @ResponseBody
    public Object test(@RequestBody String jsonObject) {
        System.out.println("OKS");
        System.out.println(jsonObject);
        return "test";
    }

    @GetMapping("test1")
    @ResponseBody
    public Object test1(@RequestParam(name = "id") int id) {
        System.out.println(id);
        return "test1";
    }
}
