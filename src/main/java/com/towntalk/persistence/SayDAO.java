package com.towntalk.persistence;

import java.util.List;

import com.towntalk.domain.Criteria;
import com.towntalk.domain.SayVO;

public interface SayDAO {

	public void create(SayVO say) throws Exception;

	public SayVO read(Integer sno) throws Exception;

	public void update(SayVO say) throws Exception;

	public void delete(Integer sno) throws Exception;

	public List<SayVO> sayList(Criteria cri) throws Exception;
	
	public int cntPaging(Criteria cri) throws Exception;
	
}
