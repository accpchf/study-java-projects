package org.springboot.service;

import org.springboot.dao.cluster.CityDao;
import org.springboot.dao.master.UserDao;
import org.springboot.domain.City;
import org.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;

/**
 * 用户业务实现层
 *
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源

    public User findByName(String userName) {
    	User user2 = userDao.selectByPrimaryKey(1);
    	
    	System.out.println("------"+user2.getUserName());
    	
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("温岭市");
        user.setCity(city);
        return user;
    }
    
/*    public User findByName(String userName) {
    	Example example = new Example(User.class);
    	example.selectProperties("userName", userName);
    	
        User user = userDao.selectOneByExample(example);
        	
        Example example2 = new Example(City.class);
    	example.selectProperties("cityName", "温岭市");
        City city = cityDao.selectOneByExample(example2);
        user.setCity(city);
        return user;
    }*/
}
