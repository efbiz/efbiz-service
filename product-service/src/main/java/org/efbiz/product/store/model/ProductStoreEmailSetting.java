package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.store.model.ProductStoreEmailSettingKey;

public class ProductStoreEmailSetting extends ProductStoreEmailSettingKey implements Serializable {
    private String bodyScreenLocation;

    private String xslfoAttachScreenLocation;

    private String fromAddress;

    private String ccAddress;

    private String bccAddress;

    private String subject;

    private String contentType;

    private static final long serialVersionUID = 1L;

    public String getBodyScreenLocation() {
        return bodyScreenLocation;
    }

    public void setBodyScreenLocation(String bodyScreenLocation) {
        this.bodyScreenLocation = bodyScreenLocation == null ? null : bodyScreenLocation.trim();
    }

    public String getXslfoAttachScreenLocation() {
        return xslfoAttachScreenLocation;
    }

    public void setXslfoAttachScreenLocation(String xslfoAttachScreenLocation) {
        this.xslfoAttachScreenLocation = xslfoAttachScreenLocation == null ? null : xslfoAttachScreenLocation.trim();
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    public String getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress == null ? null : ccAddress.trim();
    }

    public String getBccAddress() {
        return bccAddress;
    }

    public void setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress == null ? null : bccAddress.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}