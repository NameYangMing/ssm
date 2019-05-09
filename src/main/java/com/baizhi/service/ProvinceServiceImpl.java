package com.baizhi.service;

import com.baizhi.dao.ProvinceDao;
import com.baizhi.entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao provinceDao;

    //查询所有省
    @Override
    public List<Province> queryAll() {
        return provinceDao.queryAll();
    }
}
