package com.baizhi.dao;

import com.baizhi.entity.City;
import com.baizhi.entity.Province;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceDao {
    //查询所有省
    List<Province> queryAll();

    List<City> queryCityById(@Param("id") String id);
}
