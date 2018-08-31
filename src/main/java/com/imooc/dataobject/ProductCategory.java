package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目 实体类
 * Created by 廖师兄
 * 2017-05-07 14:30
 */
@Entity
@DynamicUpdate //动态更新 update 字段 要配合数据库设置
@Data //减少 get set 方法  要是lombok 需要在idea 安装插件
// @Table(name = "product_category") 可以不加 因为表明和实体类名称相差不大 jpa 帮我们处理
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
