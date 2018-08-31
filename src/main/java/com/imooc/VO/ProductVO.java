package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 一个类目包含多个商品
 * Created by 廖师兄
 * 2017-05-12 14:20
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    //类目编号
    @JsonProperty("type")
    private Integer categoryType;

    //商品集合
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
