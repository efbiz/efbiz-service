package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductStoreCatalogKey extends BaseEntity implements Serializable {
    private String productStoreId;

    private String prodCatalogId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId == null ? null : prodCatalogId.trim();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}