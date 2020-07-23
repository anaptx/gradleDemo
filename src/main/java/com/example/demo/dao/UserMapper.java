package com.example.demo.dao;

import com.example.demo.pojo.SystemUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author fengqian07
 * @Description
 * @date 2020/7/22 11:18
 */
public interface UserMapper {
    SystemUser getUserInfo(@Param("id") String id);
}
