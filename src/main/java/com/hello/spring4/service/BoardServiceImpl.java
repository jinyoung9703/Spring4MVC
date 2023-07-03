package com.hello.spring4.service;

import com.hello.spring4.dao.BoardDAO;
import com.hello.spring4.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service("bsrv")
public class BoardServiceImpl implements BoardService{

    @Autowired BoardDAO bdao;

    @Override
    public List<Board> readBoard(int cpg) {
        int snum = (cpg - 1) * 15;

        return bdao.selectBoard(snum);


    }

    @Override
    public Board readOneBoard(String bno) {

        return bdao.selectOneBoard(bno);
    }

    @Override
    public boolean saveBoard(Board bd) {
        boolean isSaved = false;

        if(bdao.insertBoard(bd) > 0) isSaved = true;

        return isSaved; // 두개중에 하나를 선택할때 isSaved변수를 사용한다
    }
}
