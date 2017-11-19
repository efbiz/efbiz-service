package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProdConfItemContentKey extends ObjectValue implements Serializable {
    private String configItemId;

    private String contentId;

    private String confItemContentTypeId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId == null ? null : configItemId.trim();
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public String getConfItemContentTypeId() {
        return confItemContentTypeId;
    }

    public void setConfItemContentTypeId(String confItemContentTypeId) {
        this.confItemContentTypeId = confItemContentTypeId == null ? null : confItemContentTypeId.trim();
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