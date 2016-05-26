package com.towntalk.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.towntalk.domain.SayReplyVO;

@Repository
public class SayReplyDAOImpl implements SayReplyDAO {

	@Autowired
	private SqlSession session;

	private static String namespace = "com.towntalk.persistence.SayReplyDAO";

	@Override
	public List<SayReplyVO> list(Integer sno) throws Exception {

		return session.selectList(namespace + ".list", sno);
	}

	@Override
	public void create(SayReplyVO vo) throws Exception {

		session.insert(namespace + ".create", vo);
	}

	@Override
	public void update(SayReplyVO vo) throws Exception {

		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(Integer rno) throws Exception {

		session.update(namespace + ".delete", rno);
	}

}
