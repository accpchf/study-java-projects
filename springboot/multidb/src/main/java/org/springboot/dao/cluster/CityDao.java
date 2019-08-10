package org.springboot.dao.cluster;

import org.apache.ibatis.annotations.Param;
import org.springboot.domain.City;

import tk.mybatis.mapper.common.Mapper;

public interface CityDao extends Mapper<City>{
	
	 City findByName(@Param("cityName") String cityName);
}
