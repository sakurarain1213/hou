package com.example.hou.controller;

import com.example.hou.entity.UserInfo;
import com.example.hou.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //增加
    @RequestMapping(value="/add",method = RequestMethod.POST)//增加了method选项
    public UserInfo add(@RequestBody UserInfo userInfo) {
        userInfo.setCreateTime(LocalDateTime.now());
        return userInfoService.save(userInfo);
    }

    //删除
    @RequestMapping("delete/{id}")
    public int delete(@PathVariable Integer id) {
        return userInfoService.deleteById(id);
    }

    //修改
    @RequestMapping("/update")
    public int update(@RequestBody UserInfo userInfo) {
        return userInfoService.Update(userInfo);
    }

    //查询
    @RequestMapping("/get/{id}")
    public UserInfo get(@PathVariable Integer id) {
        return userInfoService.getUserInfo(id);
    }

    //查询全部
    @RequestMapping("/list")
    public List<UserInfo> list() {
        return userInfoService.selectAll();
    }

}
