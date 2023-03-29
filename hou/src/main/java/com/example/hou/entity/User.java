package com.example.hou.entity;

import lombok.*;

import javax.persistence.Entity;


@Getter//lombok自动生成get方法 但是要写在属性上
@Setter//同理 set方法
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data//写在类上
public class User {

    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private String info;
    private String school;
    private String studentID;
    private String email;
    private String tel;

/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getinfo() {
        return info;
    }

    public void setinfo(String info) {
        this.info = info;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String info) {
        this.school = school;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

*/
    /*@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

     */
}