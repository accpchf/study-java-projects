package org.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.dao.master.UserDao;
import org.springboot.domain.City;
import org.springboot.domain.User;
import org.springboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(Application.class)
public class MultidbTest {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Test
	public void test() throws Exception {
		User user=userServiceImpl.findByName("泥瓦匠");
		Assert.assertNotNull(user);
		City city=user.getCity();
		Assert.assertNotNull(city);
	}
	
	
/*	@Autowired
	private UserDao userDao;
	

	
	@Test
	public void test2() throws Exception {
		User user=userDao.findByName("泥瓦匠");
		Assert.assertNotNull(user);
	}*/
}
