package com.example.demo.controller;

import com.example.demo.pojo.SystemUser;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fengqian07
 * @Description
 * @date 2020/7/17 15:41
 */
@RestController
@RequestMapping("user")
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("info/{id}")
    public SystemUser getUserInfo(@PathVariable("id") String id){
        return helloService.getUserInfo(id);
    }
}