package com.lcss.spikegoodssystem.service;

import com.lcss.spikegoodssystem.api.ResponseGoodsInformation;
import org.springframework.stereotype.Service;


public interface GoodsService {

     ResponseGoodsInformation getGoodDetail(String goodsId);
}
