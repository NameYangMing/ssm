package com.baizhi.dao;

import com.baizhi.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityDAO {

    List<City> queryCityByPid(@Param("pid") String pid);

}
