package com.example.hou.entity;
import lombok.*;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
//@Data 就是lombok 的注解 自动生成了set get
@Data
@TableName(value = "user_info")  //@TableName 对应你的数据库表名
public class UserInfo {
    public UserInfo(){}
    @TableId(value = "id",type = IdType.AUTO)  //@TableId 说明这条数据自增长也是对应数据库自增长的
    private Integer id;
    private String username;
    private String password;
    private LocalDateTime createTime;
}
