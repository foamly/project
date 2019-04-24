package com.mx.service;

import com.mx.mapper.ShiroDao;
import com.mx.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiroServiceImpl implements ShiroService{
    @Autowired
    private ShiroDao shiroDao;
    @Override
    public UserBean queryUserByName(String userName) {
        return shiroDao.queryUserByName(userName);
    }
}
