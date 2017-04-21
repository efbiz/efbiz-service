package org.efbiz.product.catalog.service;

import java.util.List;
import org.efbiz.product.catalog.dao.ProdCatalogMapper;
import org.efbiz.product.catalog.model.ProdCatalog;
import org.efbiz.product.catalog.model.ProdCatalogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdCatalogService{
    
    @Autowired
    private ProdCatalogMapper prodCatalogMapper;
    
    public List<ProdCatalog> findProdCatalogs(ProdCatalogExample example) throws Exception{
        return  prodCatalogMapper.selectByExample(example);   
    }
    
}
