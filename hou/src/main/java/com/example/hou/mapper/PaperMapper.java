package com.example.hou.mapper;

import com.example.hou.entity.Paper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public interface PaperMapper {
    Paper getPaperInfo(int id);
    int save (Paper paper);

    int update (Paper paper);

    int deleteById (int id);

    List <Paper> selectAll ();

}