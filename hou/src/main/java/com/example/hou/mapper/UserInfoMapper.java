package com.example.hou.mapper;



import com.example.hou.entity.UserInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public interface UserInfoMapper {

    UserInfo getUserInfo(int id);

   int save(UserInfo userInfo);

     int update(UserInfo userInfo);

    int deleteById(int id);

    static List<UserInfo> selectAll() {
        return null;
    }

}
