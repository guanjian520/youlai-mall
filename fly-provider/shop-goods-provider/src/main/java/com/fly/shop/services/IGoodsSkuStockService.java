package com.fly.shop.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fly.shop.pojo.entity.GoodsSkuStock;

import java.util.List;

/**
 * @description:
 * @author: Mr.
 * @create: 2020-03-24 15:32
 **/
public interface IGoodsSkuStockService extends IService<GoodsSkuStock> {

    List<GoodsSkuStock> getList(Long goodsId, String keyword);

    boolean update(Long goodsId, List<GoodsSkuStock> skuStockList);
}
