package com.towntalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.towntalk.domain.SayReplyVO;
import com.towntalk.persistence.SayReplyDAO;

@Service
public class SayReplyServiceImpl implements SayReplyService {

	@Autowired
	private SayReplyDAO dao;

	@Override
	public void addReply(SayReplyVO vo) throws Exception {

		dao.create(vo);
	}

	@Override
	public List<SayReplyVO> listReply(Integer sno) throws Exception {

		return dao.list(sno);
	}

	@Override
	public void modifyReply(SayReplyVO vo) throws Exception {

		dao.update(vo);
	}

	@Override
	public void removeReply(Integer rno) throws Exception {

		dao.delete(rno);
	}

}
