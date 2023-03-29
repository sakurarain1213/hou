package com.example.hou.mapper;

import com.example.hou.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserInfo(int id);
    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll ();
}