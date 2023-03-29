package com.example.hou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: hou
 * @description:
 * @author: 作者
 * @create: 2022-12-25 15:33
 */
@Controller
public class test {
  @RequestMapping("/")
  @ResponseBody
  public String hello(){
      return "aaaaaa";
  }
//localhost:8081/
}
