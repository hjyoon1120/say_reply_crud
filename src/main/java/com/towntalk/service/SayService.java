package com.towntalk.service;

import java.util.List;

import com.towntalk.domain.Criteria;
import com.towntalk.domain.SayVO;

public interface SayService {
	
	public void regist(SayVO say) throws Exception;
	
	public SayVO read(Integer sno) throws Exception;
	
	public void modify(SayVO say) throws Exception;
	
	public void remove(Integer sno) throws Exception;
	
	public List<SayVO> sayList(Criteria cri) throws Exception;

	public int listCnt(Criteria cri) throws Exception;
}
