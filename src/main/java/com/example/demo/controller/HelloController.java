package com.example.demo.controller;

import com.example.demo.forest.ForestClient;
import com.example.demo.pojo.SystemUser;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    @Resource
    private ForestClient forestClient;

    @GetMapping("forest")
    public Map forestTest(){
        return forestClient.getLocation("121.475078", "31.223577");
    }

    @GetMapping("info/{id}")
    public SystemUser getUserInfo(@PathVariable("id") String id){
        return helloService.getUserInfo(id);
    }

    @GetMapping("title")
    public List<String> getTitle(){
        return helloService.getTitle();
    }

    @PostMapping("createQRCode")
    public String createQRCode(String url) throws Exception {
        return helloService.createQRCode(url);
    }
}
