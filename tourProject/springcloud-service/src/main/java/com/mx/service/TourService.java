package com.mx.service;

import com.mx.pojo.GoodsBean;

import java.util.List;
import java.util.Map;

public interface TourService {
    List<GoodsBean> queryGoodsList();

    List<GoodsBean> queryGoodsListById(Integer id);

    void addGoods(Map<String, Object> map);
}
