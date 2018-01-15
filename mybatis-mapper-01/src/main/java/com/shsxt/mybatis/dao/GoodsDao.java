package com.shsxt.mybatis.dao;

import com.shsxt.mybatis.pojo.Goods;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/15.
 */
public interface GoodsDao {

    public Goods queryGoodsById (int id);

    /**
     * 根据商品名称 模糊查询
     * @return
     */
    public List<Goods> queryGoodslikeGoodsName (String goodsName);

    public Goods queryGoodsByIdAndGoodsName (Map<String, Object> params);

    public Goods queryGoodsByIdAndGoodsNameV2 (Goods goods);
}
