package com.towntalk.test;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

}
