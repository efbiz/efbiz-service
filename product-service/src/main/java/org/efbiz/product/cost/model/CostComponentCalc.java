package org.efbiz.product.cost.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.model.BaseEntity;

public class CostComponentCalc extends BaseEntity implements Serializable {
    private String costComponentCalcId;

    private String description;

    private String costGlAccountTypeId;

    private String offsettingGlAccountTypeId;

    private BigDecimal fixedCost;

    private BigDecimal variableCost;

    private BigDecimal perMilliSecond;

    private String currencyUomId;

    private String costCustomMethodId;

    private static final long serialVersionUID = 1L;

    public String getCostComponentCalcId() {
        return costComponentCalcId;
    }

    public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId == null ? null : costComponentCalcId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCostGlAccountTypeId() {
        return costGlAccountTypeId;
    }

    public void setCostGlAccountTypeId(String costGlAccountTypeId) {
        this.costGlAccountTypeId = costGlAccountTypeId == null ? null : costGlAccountTypeId.trim();
    }

    public String getOffsettingGlAccountTypeId() {
        return offsettingGlAccountTypeId;
    }

    public void setOffsettingGlAccountTypeId(String offsettingGlAccountTypeId) {
        this.offsettingGlAccountTypeId = offsettingGlAccountTypeId == null ? null : offsettingGlAccountTypeId.trim();
    }

    public BigDecimal getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(BigDecimal fixedCost) {
        this.fixedCost = fixedCost;
    }

    public BigDecimal getVariableCost() {
        return variableCost;
    }

    public void setVariableCost(BigDecimal variableCost) {
        this.variableCost = variableCost;
    }

    public BigDecimal getPerMilliSecond() {
        return perMilliSecond;
    }

    public void setPerMilliSecond(BigDecimal perMilliSecond) {
        this.perMilliSecond = perMilliSecond;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId == null ? null : currencyUomId.trim();
    }

    public String getCostCustomMethodId() {
        return costCustomMethodId;
    }

    public void setCostCustomMethodId(String costCustomMethodId) {
        this.costCustomMethodId = costCustomMethodId == null ? null : costCustomMethodId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}