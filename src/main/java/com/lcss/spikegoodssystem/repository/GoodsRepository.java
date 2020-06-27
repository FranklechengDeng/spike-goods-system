package com.lcss.spikegoodssystem.repository;

import com.lcss.spikegoodssystem.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName GoodsRepository
 * @Description TODO
 * @Author xusisi
 * @Date 2020/6/27 下午6:21
 */
@Repository
public interface GoodsRepository extends JpaRepository<Goods,String> {
     Goods findGoodsByGoodsId(String goodId);
}
