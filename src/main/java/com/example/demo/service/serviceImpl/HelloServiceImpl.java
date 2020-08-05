package com.example.demo.service.serviceImpl;

import com.example.demo.dao.LogTestMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.LogTest;
import com.example.demo.pojo.SystemUser;
import com.example.demo.service.HelloService;
import com.example.demo.utils.QRCodeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fengqian07
 * @Description
 * @date 2020/7/17 15:40
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private LogTestMapper logTestMapper;

    @Override
    public SystemUser getUserInfo(String id) {
        return userMapper.getUserInfo(id);
    }

    @Override
    public List<String> getTitle() {
        List<LogTest> title = logTestMapper.getTitle();
        List<String> strings = new ArrayList<>();
        title.forEach(t-> strings.add(t.getTitle().split("\"projectContractId\":\"")[1].split("\",\"projectContractName\":")[0]));
        return strings.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public String createQRCode(String url) throws Exception {
        String path = "E:\\file\\" + System.currentTimeMillis() + ".jpg";
        QRCodeUtil.encode(url,"C:\\Users\\fengqian07\\Desktop\\load.jpg",path,true);
        return path;
    }
}
