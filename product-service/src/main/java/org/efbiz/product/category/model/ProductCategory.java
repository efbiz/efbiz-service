package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductCategory extends ObjectValue implements Serializable {
    private String productCategoryId;

    private String productCategoryTypeId;

    private String primaryParentCategoryId;

    private String categoryName;

    private String description;

    private String categoryImageUrl;

    private String linkOneImageUrl;

    private String linkTwoImageUrl;

    private String detailScreen;

    private String showInSelect;

    private String longDescription;

    private static final long serialVersionUID = 1L;

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
    }

    public String getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId == null ? null : productCategoryTypeId.trim();
    }

    public String getPrimaryParentCategoryId() {
        return primaryParentCategoryId;
    }

    public void setPrimaryParentCategoryId(String primaryParentCategoryId) {
        this.primaryParentCategoryId = primaryParentCategoryId == null ? null : primaryParentCategoryId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl == null ? null : categoryImageUrl.trim();
    }

    public String getLinkOneImageUrl() {
        return linkOneImageUrl;
    }

    public void setLinkOneImageUrl(String linkOneImageUrl) {
        this.linkOneImageUrl = linkOneImageUrl == null ? null : linkOneImageUrl.trim();
    }

    public String getLinkTwoImageUrl() {
        return linkTwoImageUrl;
    }

    public void setLinkTwoImageUrl(String linkTwoImageUrl) {
        this.linkTwoImageUrl = linkTwoImageUrl == null ? null : linkTwoImageUrl.trim();
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen == null ? null : detailScreen.trim();
    }

    public String getShowInSelect() {
        return showInSelect;
    }

    public void setShowInSelect(String showInSelect) {
        this.showInSelect = showInSelect == null ? null : showInSelect.trim();
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription == null ? null : longDescription.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}