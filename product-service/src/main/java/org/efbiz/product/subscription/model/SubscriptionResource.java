package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class SubscriptionResource extends ObjectValue implements Serializable {
    private String subscriptionResourceId;

    private String parentResourceId;

    private String description;

    private String contentId;

    private String webSiteId;

    private String serviceNameOnExpiry;

    private static final long serialVersionUID = 1L;

    public String getSubscriptionResourceId() {
        return subscriptionResourceId;
    }

    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId == null ? null : subscriptionResourceId.trim();
    }

    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId == null ? null : parentResourceId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId == null ? null : webSiteId.trim();
    }

    public String getServiceNameOnExpiry() {
        return serviceNameOnExpiry;
    }

    public void setServiceNameOnExpiry(String serviceNameOnExpiry) {
        this.serviceNameOnExpiry = serviceNameOnExpiry == null ? null : serviceNameOnExpiry.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}