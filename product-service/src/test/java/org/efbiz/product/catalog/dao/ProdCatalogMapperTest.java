package org.efbiz.product.catalog.dao;

import org.efbiz.product.catalog.model.ProdCatalog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
 

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.MOCK)
@Transactional
public class ProdCatalogMapperTest {
    
    @Autowired
    private WebApplicationContext context;
    
    @Autowired
    private ProdCatalogMapper prodCatalogMapper;
    
    @Before
    public void beforeTest(){
        MockitoAnnotations.initMocks(this);
    }
         
    @Test
    public void selectByPrimaryKey() throws Exception{
        ProdCatalog prodCatalog = prodCatalogMapper.selectByPrimaryKey("1");
        Assert.assertNull("插入之前，数据库为空", prodCatalog);
    }
    
    @Test
    public void insert() throws Exception{
        ProdCatalog prod = new ProdCatalog();
        prod.setCatalogName("ad");
        prod.setProdCatalogId("1");
        prodCatalogMapper.insert(prod);
        ProdCatalog prodCatalog = prodCatalogMapper.selectByPrimaryKey("1");
        Assert.assertNotNull("插入之后，数据库不为空", prodCatalog);
        Assert.assertEquals("插入之后，查询出的商品类型ID等于1", "1", prodCatalog.getProdCatalogId());
    }
    
    @Test
    public void updateByPrimaryKeySelective() throws Exception{
        ProdCatalog prod = new ProdCatalog();
        prod.setCatalogName("CatalogName1");
        prod.setProdCatalogId("1");
        prodCatalogMapper.insert(prod);
        ProdCatalog prodCatalog = prodCatalogMapper.selectByPrimaryKey("1");
        Assert.assertNotNull("插入之后，数据库不为空", prodCatalog);
        Assert.assertEquals("插入之后，查询出的商品类型ID等于1", "1", prodCatalog.getProdCatalogId());
        Assert.assertEquals("插入之后，查询出的商品类型名称等于CatalogName1", "CatalogName1", prodCatalog.getCatalogName());
        prodCatalog.setCatalogName("CatalogName2");
        prodCatalogMapper.updateByPrimaryKeySelective(prodCatalog);
        ProdCatalog prodCatalogUpdated = prodCatalogMapper.selectByPrimaryKey("1");
        Assert.assertNotNull("插入之后，数据库不为空", prodCatalogUpdated);
        Assert.assertEquals("插入之后，查询出的商品类型ID等于1", "1", prodCatalogUpdated.getProdCatalogId());
        Assert.assertEquals("插入之后，查询出的商品类型名称等于CatalogName2", "CatalogName2", prodCatalogUpdated.getCatalogName());
    }
    
}

