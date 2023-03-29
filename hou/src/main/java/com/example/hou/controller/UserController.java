package com.example.hou.controller;

import com.example.hou.entity.User;
import com.example.hou.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//前端控制器
@RestController
@Slf4j//lombok用于日志输出
@RequestMapping("/user")//这里是浏览器8080后的地址
public class UserController {
       /* @Autowired
        private UserService userService;
        String message = "";
        @RequestMapping("/queryLimit")
        public List<User> queryLimit(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize){
            return userService.queryLimit(currentPage,pageSize);
        }
        @PostMapping("/addUser")
        public String addUer(@RequestBody User user){
            //用Mybatis执行insert语句的时候，插入成功会返回1，不成功则会抛出异常，捕获一下异常就好
            try {
                userService.addUser(user);
                message = "增加用户成功";
            }catch (Exception exception){
                message = "增加用户异常";
            }
            return message;
        }
        @PutMapping("/updateUser")
        public String updateUser(@RequestBody User user){
            //Mybatis的更新操作成功返回1，用户不存在返回0，失败则抛异常
            try {
                message = userService.updateUser(user) == 1?"更新用户成功":"用户不存在，更新失败";
            }catch (Exception exception){
                message = "更新异常";
            }
            return message;
        }
        @DeleteMapping("/deleteUser")
        public String deleteUser(@RequestBody User user){
            //Mybatis的删除操作和更新返回值一样，成功返回1，用户不存在返回0，失败则抛异常
            try {
                message = userService.deleteUser(user) == 1?"删除用户成功":"用户不存在，删除失败";
            }catch (Exception exception){
                message = "删除异常";
            }
            return message;
        }*/
       @Autowired
       private UserService userService;

    //通过用户id获取用户所有信息

    @RequestMapping(value = "getUser/{id}", method = RequestMethod.GET)
    //    http://localhost:8081/user/getUser?id=1(此处1为要获取的id）
    //    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String GetUser(@PathVariable int id) {
        return userService.getUserInfo(id).toString();
    }

    //通过用户id删除用户
    //    http://localhost:8081/testBoot/delete?id=1(此处1为要删除的id）
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userService.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //根据用户id更新用户信息
    //http://localhost:8081/user/update?id=2&userName=波波&passWord=123456&realName=lalala
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userService.save(user);
    }
    //打印所有用户信息
    //    http://localhost:8081/user/all
    @RequestMapping("/all")
    @ResponseBody
    public List<User> ListUser() {
        return userService.selectAll();
    }

    }
