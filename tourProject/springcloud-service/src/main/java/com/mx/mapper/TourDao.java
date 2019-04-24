package com.mx.mapper;

import com.mx.pojo.GoodsBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TourDao {
    List<GoodsBean> queryGoodsList();

    List<GoodsBean> queryGoodsListById(@Param("id") Integer id);

    void addGoods(@Param("map") Map<String, Object> map);
}
