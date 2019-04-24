package com.mx.mapper;

import com.mx.model.UserBean;
import org.apache.ibatis.annotations.Param;

public interface ShiroDao {
    UserBean queryUserByName(@Param("userName") String userName);
}
