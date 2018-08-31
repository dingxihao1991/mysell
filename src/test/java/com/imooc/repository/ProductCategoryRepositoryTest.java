package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ding on 2018-3-27.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryName("奥特曼1");
        //save 方法 如果主键有值 那就是执行更新
        ProductCategory result = repository.save(productCategory);
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("花菜", 11);
        //save 方法 如果主键有值 那就是执行更新
        ProductCategory result = repository.save(productCategory);
     //   Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> asList = Arrays.asList(2,10,11);
        List<ProductCategory> result = repository.findByCategoryTypeIn(asList);
        Assert.assertNotEquals(0 , result.size());
    }

}