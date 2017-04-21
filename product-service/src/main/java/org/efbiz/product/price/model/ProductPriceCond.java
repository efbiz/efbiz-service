package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.price.model.ProductPriceCondKey;

public class ProductPriceCond extends ProductPriceCondKey implements Serializable {
    private String inputParamEnumId;

    private String operatorEnumId;

    private String condValue;

    private static final long serialVersionUID = 1L;

    public String getInputParamEnumId() {
        return inputParamEnumId;
    }

    public void setInputParamEnumId(String inputParamEnumId) {
        this.inputParamEnumId = inputParamEnumId == null ? null : inputParamEnumId.trim();
    }

    public String getOperatorEnumId() {
        return operatorEnumId;
    }

    public void setOperatorEnumId(String operatorEnumId) {
        this.operatorEnumId = operatorEnumId == null ? null : operatorEnumId.trim();
    }

    public String getCondValue() {
        return condValue;
    }

    public void setCondValue(String condValue) {
        this.condValue = condValue == null ? null : condValue.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}