package com.mx.controller;

import com.mx.pojo.GoodsBean;
import com.mx.service.TourService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TourController {
    @Autowired
    private TourService tourService;

    /**
     * 查询首页商品
     * @return
     */
    //首页
    @GetMapping("queryGoodsList")
    @ResponseBody
    public List<GoodsBean> queryGoodsList(){
        return tourService.queryGoodsList();
    }

    /**
     * 商品详情
     * @param id
     * @return
     */
    //商品
    @GetMapping("queryGoodsListById")
    @ResponseBody
    public List<GoodsBean> queryGoodsListById(@RequestParam("id") Integer id){
        System.out.println("id = [" + id + "]");
        return tourService.queryGoodsListById(id);
    }

    /**
     * 新增商品
     * @param map
     */
    //预定
    @RabbitListener(queues = "payGoods")
    public void addGoods(@RequestBody Map<String,Object> map){
        System.out.println("map = [" + map + "]");
        tourService.addGoods(map);
    }
}
