package com.mx.service;

import com.mx.pojo.GoodsBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TourApiService {
    //首页
    @GetMapping("queryGoodsList")
    List<GoodsBean> queryGoodsList();

    /**
     * 商品详情
     * @param id
     * @return
     */
    //商品
    @GetMapping("queryGoodsListById")
    List<GoodsBean> queryGoodsListById(@RequestParam("id") Integer id);
}
