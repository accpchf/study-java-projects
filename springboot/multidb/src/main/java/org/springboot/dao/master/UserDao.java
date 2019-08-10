package org.springboot.dao.master;

import org.apache.ibatis.annotations.Param;
import org.springboot.domain.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User>{
	User findByName(@Param("userName") String userName);
}
