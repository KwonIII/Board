package com.koo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koo.mapper.BoardMapper;
import com.koo.model.BoardVO;
import com.koo.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService{

	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void enroll(BoardVO board) {
		mapper.enroll(board);
		
	}

//	게시판 목록
	@Override
	public List<BoardVO> getList() {
		
		return mapper.getList();
	}
//	게시판 조회
	@Override
	public BoardVO getPage(int bno) {
		
		
		return mapper.getPage(bno);
	}
//	게시판 수정
	@Override
	public int modify(BoardVO board) {
		
		return mapper.modify(board);
	}
//	게시판 삭제
	@Override
	public int delete(int bno) {
		return mapper.delete(bno);
	}

	@Override
	public List<BoardVO> getListPaging(Criteria cri) {
		return mapper.getListPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}
	
}
