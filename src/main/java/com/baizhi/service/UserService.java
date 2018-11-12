package com.baizhi.service;

import com.baizhi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
//    查询所有
    public List<User> queryAll();
}
