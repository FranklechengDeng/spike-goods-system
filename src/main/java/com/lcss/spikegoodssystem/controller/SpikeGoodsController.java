package com.lcss.spikegoodssystem.controller;

import com.lcss.spikegoodssystem.api.*;
import com.lcss.spikegoodssystem.entity.Order;
import com.lcss.spikegoodssystem.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SpikeGoodsController
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午5:13
 */
@RestController
@RequestMapping("spikeGoods")
public class SpikeGoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getSpikeDescriptions/{goodsId}")
    public ResponseEntity<ResponseGoodsInformation> getSpikeGoods(@PathVariable("goodsId") String goodsId){
        return ResponseEntity.ok(goodsService.getGoodDetail(goodsId));
    }

    @PostMapping("/createOrder")
    public ResponseEntity<ResponseOrderInformation> createOrder(@RequestBody RequestOrder requestOrder){
        return ResponseEntity.ok(new ResponseOrderInformation());
    }

    @GetMapping("/getOrderLists")
    public ResponseEntity<List<Order>> getOrderLists(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/getOrderDetail/{orderId}")
    public ResponseEntity<ResponseOrderInformation> getOrderDetail(@PathVariable("orderId") String orderId){
        return ResponseEntity.ok(new ResponseOrderInformation());
    }

    @PostMapping("/updateOrder")
    public ResponseEntity<ResponseOrderInformation> updateOrder(@RequestParam("orderId") String orderId){
        return ResponseEntity.ok(new ResponseOrderInformation());

    }


}
