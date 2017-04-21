package org.efbiz.product.catalog.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;
 

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.MOCK)
public class ProdCatalogTest {
    
    @Autowired
    private WebApplicationContext context;
    
    @Before
    public void beforeTest(){
        MockitoAnnotations.initMocks(this);
//      mockMvc = MockMvcBuilders.webAppContextSetup(context).build(); 
    }
         
    @Test
    public void testToString() throws Exception{
        ProdCatalog prod = new ProdCatalog();
        prod.setCatalogName("ad");
        prod.setProdCatalogId("1");
        Assert.assertEquals("toString ", "{\"prodCatalogId\":\"1\",\"catalogName\":\"ad\"}", prod.toString());
    }
    
}

