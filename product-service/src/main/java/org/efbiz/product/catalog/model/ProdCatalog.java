package org.efbiz.product.catalog.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProdCatalog extends ObjectValue implements Serializable {
    private String prodCatalogId;

    private String catalogName;

    private String useQuickAdd;

    private String styleSheet;

    private String headerLogo;

    private String contentPathPrefix;

    private String templatePathPrefix;

    private String viewAllowPermReqd;

    private String purchaseAllowPermReqd;

    private static final long serialVersionUID = 1L;

    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId == null ? null : prodCatalogId.trim();
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    public String getUseQuickAdd() {
        return useQuickAdd;
    }

    public void setUseQuickAdd(String useQuickAdd) {
        this.useQuickAdd = useQuickAdd == null ? null : useQuickAdd.trim();
    }

    public String getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet == null ? null : styleSheet.trim();
    }

    public String getHeaderLogo() {
        return headerLogo;
    }

    public void setHeaderLogo(String headerLogo) {
        this.headerLogo = headerLogo == null ? null : headerLogo.trim();
    }

    public String getContentPathPrefix() {
        return contentPathPrefix;
    }

    public void setContentPathPrefix(String contentPathPrefix) {
        this.contentPathPrefix = contentPathPrefix == null ? null : contentPathPrefix.trim();
    }

    public String getTemplatePathPrefix() {
        return templatePathPrefix;
    }

    public void setTemplatePathPrefix(String templatePathPrefix) {
        this.templatePathPrefix = templatePathPrefix == null ? null : templatePathPrefix.trim();
    }

    public String getViewAllowPermReqd() {
        return viewAllowPermReqd;
    }

    public void setViewAllowPermReqd(String viewAllowPermReqd) {
        this.viewAllowPermReqd = viewAllowPermReqd == null ? null : viewAllowPermReqd.trim();
    }

    public String getPurchaseAllowPermReqd() {
        return purchaseAllowPermReqd;
    }

    public void setPurchaseAllowPermReqd(String purchaseAllowPermReqd) {
        this.purchaseAllowPermReqd = purchaseAllowPermReqd == null ? null : purchaseAllowPermReqd.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}