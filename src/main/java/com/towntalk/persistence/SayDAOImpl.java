package com.towntalk.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.towntalk.domain.SayVO;

@Repository
public class SayDAOImpl implements SayDAO {

	@Autowired
	private SqlSession session;

	private static String namespace = "com.towntalk.persistence.SayDAO";

	@Override
	public void create(SayVO say) throws Exception {
		session.insert(namespace + ".create", say);
	}

	@Override
	public SayVO read(Integer sno) throws Exception {
		return session.selectOne(namespace + ".read", sno);
	}

	@Override
	public void update(SayVO say) throws Exception {
		session.update(namespace + ".update", say);
	}

	@Override
	public void delete(Integer sno) throws Exception {
		session.delete(namespace + ".delete", sno);
	}

	@Override
	public List<SayVO> sayList() throws Exception {
		return session.selectList(namespace + ".sayList");
	}

}
