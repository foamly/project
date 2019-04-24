package com.mx.service;

import com.mx.model.UserBean;

public interface ShiroService {
    UserBean queryUserByName(String userName);
}
