package com.example.hou.dao;
import com.example.hou.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//可以不要dao层
@Mapper
public interface UserDao {
    List<User> queryLimit(Integer currentPage, Integer pageSize);

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(User user);
}

