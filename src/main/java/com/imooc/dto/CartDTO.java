package com.imooc.dto;

import lombok.Data;

/**
 * 相当于购物车，订单详情的数据传输对象
 * 也就是一个订单 有很多商品
 * Created by 廖师兄
 * 2017-06-11 19:37
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
