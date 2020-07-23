package com.example.demo.service.serviceImpl;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.SystemUser;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fengqian07
 * @Description
 * @date 2020/7/17 15:40
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    private UserMapper userMapper;

    @Override
    public SystemUser getUserInfo(String id) {
        return userMapper.getUserInfo(id);
    }
}
