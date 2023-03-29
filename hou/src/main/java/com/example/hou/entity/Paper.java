package com.example.hou.entity;

import lombok.*;

@Getter//lombok自动生成get方法
@Setter//同理 set方法
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Paper {
    private Integer id;
    private String paperName;
    private String paperAuthor;
    private String paperDate;
    private String paperInfo;
    private String paperCondition;
    private String type;
/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperAuthor() {
        return paperAuthor;
    }

    public void setPaperAuthor(String PaperAuthor) {
        this.paperAuthor =paperAuthor;
    }

    public String getPaperDate() {
        return paperDate;
    }

    public void setPaperDate(String realName) {
        this.paperDate = paperDate;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", paperName='" + paperName + '\'' +
                ", paperAuthor='" + paperAuthor + '\'' +
                ", paperDate='" + paperDate + '\'' +
                '}';
    }*/
}