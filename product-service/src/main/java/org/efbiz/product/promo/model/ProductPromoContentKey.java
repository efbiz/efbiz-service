package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductPromoContentKey extends BaseEntity implements Serializable {
    private String productPromoId;

    private String contentId;

    private String productPromoContentTypeId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId == null ? null : productPromoId.trim();
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public String getProductPromoContentTypeId() {
        return productPromoContentTypeId;
    }

    public void setProductPromoContentTypeId(String productPromoContentTypeId) {
        this.productPromoContentTypeId = productPromoContentTypeId == null ? null : productPromoContentTypeId.trim();
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