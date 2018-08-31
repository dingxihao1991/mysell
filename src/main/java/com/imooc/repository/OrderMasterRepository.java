package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单
 * Created by 廖师兄
 * 2017-06-11 17:24
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    //根据用户openId 查询，并且有个分页
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
