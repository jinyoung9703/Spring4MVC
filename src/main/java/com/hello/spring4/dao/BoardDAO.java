package com.hello.spring4.dao;

import com.hello.spring4.model.Board;

import java.util.List;

public interface BoardDAO {
    default List<Board> selectBoard(int snum) {
        return null;
    }
}
