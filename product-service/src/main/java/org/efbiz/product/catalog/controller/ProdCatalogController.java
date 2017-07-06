package org.efbiz.product.catalog.controller;

import io.swagger.annotations.Api;
import java.util.List;
import org.apache.log4j.Logger;
import org.efbiz.config.ProductConfig;
import org.efbiz.product.catalog.constant.CatalogConstant;
import org.efbiz.product.catalog.model.ProdCatalog;
import org.efbiz.product.catalog.model.ProdCatalogExample;
import org.efbiz.product.catalog.service.ProdCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Api
public class ProdCatalogController{
    private static Logger logger = Logger.getLogger(ProdCatalogController.class);
    
    @Autowired
    private ProdCatalogService prodCatalogService;
    
    @Autowired
    private ProductConfig productConfig;
   
    
    @RequestMapping(value = "/" + CatalogConstant.CONTEXT + "/prodcatalogs", method = RequestMethod.GET)
    List<ProdCatalog> findProdcatalogs(ProdCatalogExample example){
        try {
            System.out.println(productConfig.getVersion());
            return prodCatalogService.findProdCatalogs(example);
        } catch (Exception e) {
            logger.error("查询商品分类异常", e);
            return null;
        }
    }
    
    @RequestMapping(value = "/" + CatalogConstant.CONTEXT + "/test", method = RequestMethod.GET)
    List<ProdCatalog> test(ProdCatalogExample example){
        try {
            return prodCatalogService.findProdCatalogs(example);
        } catch (Exception e) {
            logger.error("查询商品分类异常", e);
            return null;
        }
    }
}
