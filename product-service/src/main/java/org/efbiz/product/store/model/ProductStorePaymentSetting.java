package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.store.model.ProductStorePaymentSettingKey;

public class ProductStorePaymentSetting extends ProductStorePaymentSettingKey implements Serializable {
    private String paymentService;

    private String paymentCustomMethodId;

    private String paymentGatewayConfigId;

    private String paymentPropertiesPath;

    private String applyToAllProducts;

    private static final long serialVersionUID = 1L;

    public String getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(String paymentService) {
        this.paymentService = paymentService == null ? null : paymentService.trim();
    }

    public String getPaymentCustomMethodId() {
        return paymentCustomMethodId;
    }

    public void setPaymentCustomMethodId(String paymentCustomMethodId) {
        this.paymentCustomMethodId = paymentCustomMethodId == null ? null : paymentCustomMethodId.trim();
    }

    public String getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId == null ? null : paymentGatewayConfigId.trim();
    }

    public String getPaymentPropertiesPath() {
        return paymentPropertiesPath;
    }

    public void setPaymentPropertiesPath(String paymentPropertiesPath) {
        this.paymentPropertiesPath = paymentPropertiesPath == null ? null : paymentPropertiesPath.trim();
    }

    public String getApplyToAllProducts() {
        return applyToAllProducts;
    }

    public void setApplyToAllProducts(String applyToAllProducts) {
        this.applyToAllProducts = applyToAllProducts == null ? null : applyToAllProducts.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}