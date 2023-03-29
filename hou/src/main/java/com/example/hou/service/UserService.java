package com.example.hou.service;


import com.example.hou.entity.User;
import com.example.hou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService {
  /*  @Autowired
    private UserDao userDao;

    public List<User> queryLimit(Integer currentPage,Integer pageSzie){
        return userDao.queryLimit(currentPage,pageSzie);
    }

    public Integer addUser(User user){
        return userDao.addUser(user);
    }

    public Integer updateUser(User user){
        return userDao.updateUser(user);
    }

    public Integer deleteUser(User user){
        return userDao.deleteUser(user);
    }*/
  @Autowired
  private UserMapper userMapper;

    public User getUserInfo(int id) {
        return userMapper.getUserInfo(id);
    }


    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int Update(User user) {
        return userMapper.update(user);
    }

    public User save(User user) {
        int save = userMapper.save(user);
        return user;
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

}
