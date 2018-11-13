package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> queryAll() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
        List<User> users = userDao.queryAll();
        return users;
    }
}
