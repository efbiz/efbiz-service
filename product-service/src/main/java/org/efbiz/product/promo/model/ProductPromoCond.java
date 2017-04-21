package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.promo.model.ProductPromoCondKey;

public class ProductPromoCond extends ProductPromoCondKey implements Serializable {
    private String inputParamEnumId;

    private String operatorEnumId;

    private String condValue;

    private String otherValue;

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

    public String getOtherValue() {
        return otherValue;
    }

    public void setOtherValue(String otherValue) {
        this.otherValue = otherValue == null ? null : otherValue.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}