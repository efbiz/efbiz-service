package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.subscription.model.SubscriptionCommEventKey;

public class SubscriptionCommEvent extends SubscriptionCommEventKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}