package com.towntalk.persistence;

import java.util.List;

import com.towntalk.domain.SayReplyVO;

public interface SayReplyDAO {
	
	public List<SayReplyVO> list(Integer sno) throws Exception;
	
	public void create(SayReplyVO vo) throws Exception;
	
	public void update(SayReplyVO vo) throws Exception;
	
	public void delete(Integer rno) throws Exception;
}
