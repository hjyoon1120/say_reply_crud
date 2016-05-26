package com.towntalk.service;

import java.util.List;

import com.towntalk.domain.SayReplyVO;

public interface SayReplyService {

	public void addReply(SayReplyVO vo) throws Exception;

	public List<SayReplyVO> listReply(Integer sno) throws Exception;

	public void modifyReply(SayReplyVO vo) throws Exception;

	public void removeReply(Integer rno) throws Exception;

}
