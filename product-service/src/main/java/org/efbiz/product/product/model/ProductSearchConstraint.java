package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.product.model.ProductSearchConstraintKey;

public class ProductSearchConstraint extends ProductSearchConstraintKey implements Serializable {
    private String constraintName;

    private String infoString;

    private String includeSubCategories;

    private String isAnd;

    private String anyPrefix;

    private String anySuffix;

    private String removeStems;

    private String lowValue;

    private String highValue;

    private static final long serialVersionUID = 1L;

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName == null ? null : constraintName.trim();
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString == null ? null : infoString.trim();
    }

    public String getIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(String includeSubCategories) {
        this.includeSubCategories = includeSubCategories == null ? null : includeSubCategories.trim();
    }

    public String getIsAnd() {
        return isAnd;
    }

    public void setIsAnd(String isAnd) {
        this.isAnd = isAnd == null ? null : isAnd.trim();
    }

    public String getAnyPrefix() {
        return anyPrefix;
    }

    public void setAnyPrefix(String anyPrefix) {
        this.anyPrefix = anyPrefix == null ? null : anyPrefix.trim();
    }

    public String getAnySuffix() {
        return anySuffix;
    }

    public void setAnySuffix(String anySuffix) {
        this.anySuffix = anySuffix == null ? null : anySuffix.trim();
    }

    public String getRemoveStems() {
        return removeStems;
    }

    public void setRemoveStems(String removeStems) {
        this.removeStems = removeStems == null ? null : removeStems.trim();
    }

    public String getLowValue() {
        return lowValue;
    }

    public void setLowValue(String lowValue) {
        this.lowValue = lowValue == null ? null : lowValue.trim();
    }

    public String getHighValue() {
        return highValue;
    }

    public void setHighValue(String highValue) {
        this.highValue = highValue == null ? null : highValue.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}