package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductSearchConstraintKey extends ObjectValue implements Serializable {
    private String productSearchResultId;

    private String constraintSeqId;

    private static final long serialVersionUID = 1L;

    public String getProductSearchResultId() {
        return productSearchResultId;
    }

    public void setProductSearchResultId(String productSearchResultId) {
        this.productSearchResultId = productSearchResultId == null ? null : productSearchResultId.trim();
    }

    public String getConstraintSeqId() {
        return constraintSeqId;
    }

    public void setConstraintSeqId(String constraintSeqId) {
        this.constraintSeqId = constraintSeqId == null ? null : constraintSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}