package com.towntalk.test;

import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.towntalk.domain.Criteria;
import com.towntalk.domain.SayVO;
import com.towntalk.persistence.SayDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class SayDAOTest {

	protected static final Logger logger = LoggerFactory.getLogger(DataSource.class);

	@Inject
	private SayDAO dao;

	@Test
	public void testCreate() throws Exception {
		SayVO say = new SayVO();
		say.setUser_id(871120);
		say.setBody("다시한번해봅시다");
		dao.create(say);
	}

	@Test
	public void testRead() throws Exception {
		logger.info(dao.read(897).toString());
	}

	@Test
	public void testUpdate() throws Exception {
		SayVO say = new SayVO();
		say.setSno(897);
		say.setBody("수정도 다시한번 해봅시다");
		dao.update(say);
	}

	@Test
	public void testDelete() throws Exception {
		dao.delete(896);
	}

	@Test
	public void testListPage() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);

		List<SayVO> list = dao.sayList(cri);

		for (SayVO sayVO : list) {
			logger.info(sayVO.getSno() + ":" + sayVO.getBody());
		}
	}

	@Test
	public void testURI() throws Exception {
		UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/say/read").queryParam("sno", 12)
				.queryParam("perPageNum", 20).build();

		logger.info("/say/read?sno=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
	@Test
	public void testURI2() throws Exception {
		UriComponents uriComponents = UriComponentsBuilder.newInstance().path("/{module}/{page}").queryParam("sno", 12)
				.queryParam("perPageNum", 20).build().expand("say", "read").encode();

		logger.info("/say/read?sno=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
	
	@Test
	public void testDynamic1() throws Exception {
		
		Criteria cri = new Criteria();
		
		cri.setPage(1);
		cri.setKeyword("검색어");
		
		logger.info("=======================");
		List<SayVO> list = dao.sayList(cri);
		
		for (SayVO sayVO : list) {
			logger.info(sayVO.getSno() + ": " + sayVO.getBody());
		}
		
		logger.info("========================");
		logger.info("COUNT: " + dao.listCnt(cri));
	}

}
