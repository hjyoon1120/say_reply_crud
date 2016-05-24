package com.towntalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.towntalk.domain.SayVO;
import com.towntalk.persistence.SayDAO;

@Service
public class SayServiceImpl implements SayService {
	
	@Autowired
	private SayDAO dao;
	
	@Override
	public void regist(SayVO say) throws Exception {
		dao.create(say);
	}
	
	@Override
	public SayVO read(Integer sno) throws Exception {
		return dao.read(sno);
	}
	
	@Override
	public void modify(SayVO say) throws Exception {
		dao.update(say);
	}
	
	@Override
	public void remove(Integer sno) throws Exception {
		dao.delete(sno);
	}
	
	@Override
	public List<SayVO> sayList() throws Exception {
		return dao.sayList();
	}
	
}
