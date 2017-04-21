package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.store.model.ProductStoreFinActSettingKey;

public class ProductStoreFinActSetting extends ProductStoreFinActSettingKey implements Serializable {
    private String requirePinCode;

    private String validateGCFinAcct;

    private BigDecimal accountCodeLength;

    private BigDecimal pinCodeLength;

    private BigDecimal accountValidDays;

    private BigDecimal authValidDays;

    private String purchaseSurveyId;

    private String purchSurveySendTo;

    private String purchSurveyCopyMe;

    private String allowAuthToNegative;

    private BigDecimal minBalance;

    private BigDecimal replenishThreshold;

    private String replenishMethodEnumId;

    private static final long serialVersionUID = 1L;

    public String getRequirePinCode() {
        return requirePinCode;
    }

    public void setRequirePinCode(String requirePinCode) {
        this.requirePinCode = requirePinCode == null ? null : requirePinCode.trim();
    }

    public String getValidateGCFinAcct() {
        return validateGCFinAcct;
    }

    public void setValidateGCFinAcct(String validateGCFinAcct) {
        this.validateGCFinAcct = validateGCFinAcct == null ? null : validateGCFinAcct.trim();
    }

    public BigDecimal getAccountCodeLength() {
        return accountCodeLength;
    }

    public void setAccountCodeLength(BigDecimal accountCodeLength) {
        this.accountCodeLength = accountCodeLength;
    }

    public BigDecimal getPinCodeLength() {
        return pinCodeLength;
    }

    public void setPinCodeLength(BigDecimal pinCodeLength) {
        this.pinCodeLength = pinCodeLength;
    }

    public BigDecimal getAccountValidDays() {
        return accountValidDays;
    }

    public void setAccountValidDays(BigDecimal accountValidDays) {
        this.accountValidDays = accountValidDays;
    }

    public BigDecimal getAuthValidDays() {
        return authValidDays;
    }

    public void setAuthValidDays(BigDecimal authValidDays) {
        this.authValidDays = authValidDays;
    }

    public String getPurchaseSurveyId() {
        return purchaseSurveyId;
    }

    public void setPurchaseSurveyId(String purchaseSurveyId) {
        this.purchaseSurveyId = purchaseSurveyId == null ? null : purchaseSurveyId.trim();
    }

    public String getPurchSurveySendTo() {
        return purchSurveySendTo;
    }

    public void setPurchSurveySendTo(String purchSurveySendTo) {
        this.purchSurveySendTo = purchSurveySendTo == null ? null : purchSurveySendTo.trim();
    }

    public String getPurchSurveyCopyMe() {
        return purchSurveyCopyMe;
    }

    public void setPurchSurveyCopyMe(String purchSurveyCopyMe) {
        this.purchSurveyCopyMe = purchSurveyCopyMe == null ? null : purchSurveyCopyMe.trim();
    }

    public String getAllowAuthToNegative() {
        return allowAuthToNegative;
    }

    public void setAllowAuthToNegative(String allowAuthToNegative) {
        this.allowAuthToNegative = allowAuthToNegative == null ? null : allowAuthToNegative.trim();
    }

    public BigDecimal getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(BigDecimal minBalance) {
        this.minBalance = minBalance;
    }

    public BigDecimal getReplenishThreshold() {
        return replenishThreshold;
    }

    public void setReplenishThreshold(BigDecimal replenishThreshold) {
        this.replenishThreshold = replenishThreshold;
    }

    public String getReplenishMethodEnumId() {
        return replenishMethodEnumId;
    }

    public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId == null ? null : replenishMethodEnumId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}