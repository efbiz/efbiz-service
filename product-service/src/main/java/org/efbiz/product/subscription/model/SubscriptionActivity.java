package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class SubscriptionActivity extends ObjectValue implements Serializable {
    private String subscriptionActivityId;

    private String comments;

    private Date dateSent;

    private static final long serialVersionUID = 1L;

    public String getSubscriptionActivityId() {
        return subscriptionActivityId;
    }

    public void setSubscriptionActivityId(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId == null ? null : subscriptionActivityId.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}