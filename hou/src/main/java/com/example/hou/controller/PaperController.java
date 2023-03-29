package com.example.hou.controller;

import com.example.hou.entity.Paper;
import com.example.hou.service.PaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@Slf4j//lombok用于日志输出
@RequestMapping("/paper")//这里是浏览器8080后的地址
public class PaperController {
    @Autowired
    private PaperService paperService;

    @RequestMapping(value = "getPaper/{id}", method = RequestMethod.GET)
    public String GetPaper(@PathVariable int id) {
        return paperService.getPaperInfo(id).toString();
    }

    //通过id删除
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = paperService.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //根据id更新信息
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Paper paper) {
        int result = paperService.Update(paper);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户
    //    http://localhost:8080/testBoot/insert?id=100&userName=波波&passWord=123456&realName=lalala
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Paper insert(Paper paper) {
        return paperService.save(paper);
    }
    //打印所有信息
    //    http://localhost:8081/paper/all
    @RequestMapping("/all")
    @ResponseBody
    public List<Paper> ListPaper() {
        return paperService.selectAll();
    }


}
