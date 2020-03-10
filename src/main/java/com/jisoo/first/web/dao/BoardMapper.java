package com.jisoo.first.web.dao;

import java.util.HashMap;
import java.util.List;

import com.jisoo.first.web.dto.BoardDto;

public interface BoardMapper {
	public void insertBoard(BoardDto board);
	public void updateBoard (BoardDto board);
	public void deleteboard (int num);
	public BoardDto selectOneBoard (int num);
	public List <BoardDto> selectSearchBoard (HashMap<String, Object> params);
	public List <BoardDto> selectAllBoard();
}
