package org.efbiz.product.supplier.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.supplier.model.SupplierProductKey;

public class SupplierProduct extends SupplierProductKey implements Serializable {
    private Date availableThruDate;

    private String supplierPrefOrderId;

    private String supplierRatingTypeId;

    private BigDecimal standardLeadTimeDays;

    private BigDecimal orderQtyIncrements;

    private BigDecimal unitsIncluded;

    private String quantityUomId;

    private String agreementId;

    private String agreementItemSeqId;

    private BigDecimal lastPrice;

    private BigDecimal shippingPrice;

    private String supplierProductName;

    private String supplierProductId;

    private String canDropShip;

    private String comments;

    private static final long serialVersionUID = 1L;

    public Date getAvailableThruDate() {
        return availableThruDate;
    }

    public void setAvailableThruDate(Date availableThruDate) {
        this.availableThruDate = availableThruDate;
    }

    public String getSupplierPrefOrderId() {
        return supplierPrefOrderId;
    }

    public void setSupplierPrefOrderId(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId == null ? null : supplierPrefOrderId.trim();
    }

    public String getSupplierRatingTypeId() {
        return supplierRatingTypeId;
    }

    public void setSupplierRatingTypeId(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId == null ? null : supplierRatingTypeId.trim();
    }

    public BigDecimal getStandardLeadTimeDays() {
        return standardLeadTimeDays;
    }

    public void setStandardLeadTimeDays(BigDecimal standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }

    public BigDecimal getOrderQtyIncrements() {
        return orderQtyIncrements;
    }

    public void setOrderQtyIncrements(BigDecimal orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }

    public BigDecimal getUnitsIncluded() {
        return unitsIncluded;
    }

    public void setUnitsIncluded(BigDecimal unitsIncluded) {
        this.unitsIncluded = unitsIncluded;
    }

    public String getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId == null ? null : quantityUomId.trim();
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId == null ? null : agreementId.trim();
    }

    public String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }

    public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId == null ? null : agreementItemSeqId.trim();
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(BigDecimal shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public String getSupplierProductName() {
        return supplierProductName;
    }

    public void setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName == null ? null : supplierProductName.trim();
    }

    public String getSupplierProductId() {
        return supplierProductId;
    }

    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId == null ? null : supplierProductId.trim();
    }

    public String getCanDropShip() {
        return canDropShip;
    }

    public void setCanDropShip(String canDropShip) {
        this.canDropShip = canDropShip == null ? null : canDropShip.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}