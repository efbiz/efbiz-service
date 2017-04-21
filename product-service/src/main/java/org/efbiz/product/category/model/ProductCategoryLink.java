package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.category.model.ProductCategoryLinkKey;

public class ProductCategoryLink extends ProductCategoryLinkKey implements Serializable {
    private Date thruDate;

    private String comments;

    private BigDecimal sequenceNum;

    private String titleText;

    private String imageUrl;

    private String imageTwoUrl;

    private String linkTypeEnumId;

    private String linkInfo;

    private String detailSubScreen;

    private String detailText;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText == null ? null : titleText.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getImageTwoUrl() {
        return imageTwoUrl;
    }

    public void setImageTwoUrl(String imageTwoUrl) {
        this.imageTwoUrl = imageTwoUrl == null ? null : imageTwoUrl.trim();
    }

    public String getLinkTypeEnumId() {
        return linkTypeEnumId;
    }

    public void setLinkTypeEnumId(String linkTypeEnumId) {
        this.linkTypeEnumId = linkTypeEnumId == null ? null : linkTypeEnumId.trim();
    }

    public String getLinkInfo() {
        return linkInfo;
    }

    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo == null ? null : linkInfo.trim();
    }

    public String getDetailSubScreen() {
        return detailSubScreen;
    }

    public void setDetailSubScreen(String detailSubScreen) {
        this.detailSubScreen = detailSubScreen == null ? null : detailSubScreen.trim();
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText == null ? null : detailText.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}