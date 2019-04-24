package com.mx.controller;

import com.mx.pojo.GoodsBean;
import com.mx.service.TourApiService;
import com.mx.service.TourWebService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class TourWebController {
    @Autowired
    private TourWebService tourWebService;
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 查询首页商品
     * @return
     */
    //首页
    @GetMapping("queryGoodsList")
    @ResponseBody
    public List<GoodsBean> queryGoodsList(){
        return tourWebService.queryGoodsList();
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
        return tourWebService.queryGoodsListById(id);
    }

    /**
     * 新增商品
     * @param map
     */
    //预定
    @PostMapping("addGoods")
    @ResponseBody
    public int addGoods(@RequestBody Map<String,Object> map){
        System.out.println("map = [" + map + "]");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startDate = (String) map.get("startDate");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println("map = [" + date + "]");
        int compareTo = 0;
        Date start = null;
        Date parse = null;
        try {
            start = simpleDateFormat.parse(startDate);
            parse = simpleDateFormat.parse(format);
            compareTo = start.compareTo(parse);
            System.out.println("map = [" + compareTo + "]");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        amqpTemplate.convertAndSend("payGoods",map);
        return compareTo;
    }
}