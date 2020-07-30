package com.example.demo.service;

import com.example.demo.pojo.SystemUser;
import com.example.demo.pojo.VO.TitleVO;

import java.util.List;

/**
 * @author fengqian07
 * @Description
 * @date 2020/7/17 15:41
 */
public interface HelloService {
    SystemUser getUserInfo(String id);

    List<String> getTitle();
}
