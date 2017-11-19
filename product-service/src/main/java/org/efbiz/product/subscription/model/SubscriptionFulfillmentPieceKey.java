package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class SubscriptionFulfillmentPieceKey extends ObjectValue implements Serializable {
    private String subscriptionActivityId;

    private String subscriptionId;

    private static final long serialVersionUID = 1L;

    public String getSubscriptionActivityId() {
        return subscriptionActivityId;
    }

    public void setSubscriptionActivityId(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId == null ? null : subscriptionActivityId.trim();
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId == null ? null : subscriptionId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}