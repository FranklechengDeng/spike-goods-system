package com.lcss.spikegoodssystem.service.impl;

import com.lcss.spikegoodssystem.api.ResponseGoodsInformation;
import com.lcss.spikegoodssystem.entity.Goods;
import com.lcss.spikegoodssystem.repository.GoodsRepository;
import com.lcss.spikegoodssystem.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午6:54
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public ResponseGoodsInformation getGoodDetail(String goodsId) {
        Goods goods = goodsRepository.findGoodsByGoodsId(goodsId);
        if (!StringUtils.isEmpty(goods)){
            ResponseGoodsInformation responseGoodsInformation = new ResponseGoodsInformation();
            responseGoodsInformation.setGoodsId(goods.getGoodsId());
            responseGoodsInformation.setDescription(goods.getDescription());
            responseGoodsInformation.setGoodsNumber(goods.getGoodsNumber());
            responseGoodsInformation.setGoodsPrice(goods.getGoodsPrice());
            responseGoodsInformation.setGoodsName(goods.getGoodsName());
            return responseGoodsInformation;
        }
        return null;
    }
}
