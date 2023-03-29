package com.example.hou.service;


import com.example.hou.entity.Paper;
import com.example.hou.entity.UserInfo;

import com.example.hou.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserInfoService")
public class UserInfoService {

    @Autowired
    private UserInfoMapper  userInfoMapper;

    public UserInfo getUserInfo(int id) {
        return userInfoMapper.getUserInfo(id);
    }

    public int deleteById(int id) {
        return userInfoMapper.deleteById(id);
    }

    public int Update(UserInfo userInfo) {
        return userInfoMapper.update(userInfo);
    }

    public UserInfo save(UserInfo userInfo) {
        int save = userInfoMapper.save(userInfo);
        return userInfo;
    }

    public List<UserInfo> selectAll() {
        return UserInfoMapper.selectAll();
    }

}
