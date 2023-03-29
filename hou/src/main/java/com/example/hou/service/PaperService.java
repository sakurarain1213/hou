package com.example.hou.service;

import com.example.hou.entity.Paper;
import com.example.hou.mapper.PaperMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PaperService")
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public Paper getPaperInfo(int id) {
        return paperMapper.getPaperInfo(id);
    }

    public int deleteById(int id) {
        return paperMapper.deleteById(id);
    }

    public int Update(Paper paper) {
        return paperMapper.update(paper);
    }

    public Paper save(Paper paper) {
        int save = paperMapper.save(paper);
        return paper;
    }

    public List<Paper> selectAll() {
        return paperMapper.selectAll();
    }

}
