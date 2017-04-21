package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class SubscriptionCommEventKey extends BaseEntity implements Serializable {
    private String subscriptionId;

    private String communicationEventId;

    private static final long serialVersionUID = 1L;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId == null ? null : subscriptionId.trim();
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId == null ? null : communicationEventId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}