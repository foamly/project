package com.mx.service;

import com.mx.mapper.TourDao;
import com.mx.pojo.GoodsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TourServiceImpl implements TourService{
    @Autowired
    private TourDao tourDao;

    @Override
    public List<GoodsBean> queryGoodsList() {
        return tourDao.queryGoodsList();
    }

    @Override
    public List<GoodsBean> queryGoodsListById(Integer id) {
        return tourDao.queryGoodsListById(id);
    }

    @Override
    public void addGoods(Map<String, Object> map) {
        tourDao.addGoods(map);
    }
}
