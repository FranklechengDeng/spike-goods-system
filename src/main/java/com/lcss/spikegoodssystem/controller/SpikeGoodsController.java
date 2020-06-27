package com.lcss.spikegoodssystem.controller;

import com.lcss.spikegoodssystem.api.RequestOrder;
import com.lcss.spikegoodssystem.api.ResponseGoodsInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName SpikeGoodsController
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午5:13
 */
@RestController
@RequestMapping("spikeGoods")
public class SpikeGoodsController {
    @GetMapping("/getSpikeDescriptions/{goodsId}")
    public ResponseEntity<ResponseGoodsInformation> getSpikeGoods(@PathVariable("goodsId") String goodsId){
        return ResponseEntity.ok(new ResponseGoodsInformation());
    }

    @PostMapping("/createOrder")
    public ResponseEntity<ResponseGoodsInformation> createOrder(@RequestBody RequestOrder requestOrder){
        return ResponseEntity.ok(new ResponseGoodsInformation());
    }

}
