package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品信息表
 * Created by 廖师兄
 * 2017-05-09 11:39
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    // 根据字段product_status 查看是否上架
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
