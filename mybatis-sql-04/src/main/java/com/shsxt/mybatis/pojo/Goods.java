package com.shsxt.mybatis.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Goods {

    private int id;

    private String goodsName;

    private double price;

    private List<GoodsImages> images;

}
