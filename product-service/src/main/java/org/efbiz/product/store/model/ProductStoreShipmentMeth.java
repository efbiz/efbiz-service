package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreShipmentMeth extends ObjectValue implements Serializable {
    private String productStoreShipMethId;

    private String productStoreId;

    private String shipmentMethodTypeId;

    private String partyId;

    private String roleTypeId;

    private String companyPartyId;

    private BigDecimal minWeight;

    private BigDecimal maxWeight;

    private BigDecimal minSize;

    private BigDecimal maxSize;

    private BigDecimal minTotal;

    private BigDecimal maxTotal;

    private String allowUspsAddr;

    private String requireUspsAddr;

    private String allowCompanyAddr;

    private String requireCompanyAddr;

    private String includeNoChargeItems;

    private String includeFeatureGroup;

    private String excludeFeatureGroup;

    private String includeGeoId;

    private String excludeGeoId;

    private String serviceName;

    private String configProps;

    private String shipmentCustomMethodId;

    private String shipmentGatewayConfigId;

    private BigDecimal sequenceNumber;

    private BigDecimal allowancePercent;

    private BigDecimal minimumPrice;

    private static final long serialVersionUID = 1L;

    public String getProductStoreShipMethId() {
        return productStoreShipMethId;
    }

    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId == null ? null : productStoreShipMethId.trim();
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId == null ? null : shipmentMethodTypeId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId == null ? null : roleTypeId.trim();
    }

    public String getCompanyPartyId() {
        return companyPartyId;
    }

    public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId == null ? null : companyPartyId.trim();
    }

    public BigDecimal getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(BigDecimal minWeight) {
        this.minWeight = minWeight;
    }

    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }

    public BigDecimal getMinSize() {
        return minSize;
    }

    public void setMinSize(BigDecimal minSize) {
        this.minSize = minSize;
    }

    public BigDecimal getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(BigDecimal maxSize) {
        this.maxSize = maxSize;
    }

    public BigDecimal getMinTotal() {
        return minTotal;
    }

    public void setMinTotal(BigDecimal minTotal) {
        this.minTotal = minTotal;
    }

    public BigDecimal getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(BigDecimal maxTotal) {
        this.maxTotal = maxTotal;
    }

    public String getAllowUspsAddr() {
        return allowUspsAddr;
    }

    public void setAllowUspsAddr(String allowUspsAddr) {
        this.allowUspsAddr = allowUspsAddr == null ? null : allowUspsAddr.trim();
    }

    public String getRequireUspsAddr() {
        return requireUspsAddr;
    }

    public void setRequireUspsAddr(String requireUspsAddr) {
        this.requireUspsAddr = requireUspsAddr == null ? null : requireUspsAddr.trim();
    }

    public String getAllowCompanyAddr() {
        return allowCompanyAddr;
    }

    public void setAllowCompanyAddr(String allowCompanyAddr) {
        this.allowCompanyAddr = allowCompanyAddr == null ? null : allowCompanyAddr.trim();
    }

    public String getRequireCompanyAddr() {
        return requireCompanyAddr;
    }

    public void setRequireCompanyAddr(String requireCompanyAddr) {
        this.requireCompanyAddr = requireCompanyAddr == null ? null : requireCompanyAddr.trim();
    }

    public String getIncludeNoChargeItems() {
        return includeNoChargeItems;
    }

    public void setIncludeNoChargeItems(String includeNoChargeItems) {
        this.includeNoChargeItems = includeNoChargeItems == null ? null : includeNoChargeItems.trim();
    }

    public String getIncludeFeatureGroup() {
        return includeFeatureGroup;
    }

    public void setIncludeFeatureGroup(String includeFeatureGroup) {
        this.includeFeatureGroup = includeFeatureGroup == null ? null : includeFeatureGroup.trim();
    }

    public String getExcludeFeatureGroup() {
        return excludeFeatureGroup;
    }

    public void setExcludeFeatureGroup(String excludeFeatureGroup) {
        this.excludeFeatureGroup = excludeFeatureGroup == null ? null : excludeFeatureGroup.trim();
    }

    public String getIncludeGeoId() {
        return includeGeoId;
    }

    public void setIncludeGeoId(String includeGeoId) {
        this.includeGeoId = includeGeoId == null ? null : includeGeoId.trim();
    }

    public String getExcludeGeoId() {
        return excludeGeoId;
    }

    public void setExcludeGeoId(String excludeGeoId) {
        this.excludeGeoId = excludeGeoId == null ? null : excludeGeoId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getConfigProps() {
        return configProps;
    }

    public void setConfigProps(String configProps) {
        this.configProps = configProps == null ? null : configProps.trim();
    }

    public String getShipmentCustomMethodId() {
        return shipmentCustomMethodId;
    }

    public void setShipmentCustomMethodId(String shipmentCustomMethodId) {
        this.shipmentCustomMethodId = shipmentCustomMethodId == null ? null : shipmentCustomMethodId.trim();
    }

    public String getShipmentGatewayConfigId() {
        return shipmentGatewayConfigId;
    }

    public void setShipmentGatewayConfigId(String shipmentGatewayConfigId) {
        this.shipmentGatewayConfigId = shipmentGatewayConfigId == null ? null : shipmentGatewayConfigId.trim();
    }

    public BigDecimal getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(BigDecimal sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public BigDecimal getAllowancePercent() {
        return allowancePercent;
    }

    public void setAllowancePercent(BigDecimal allowancePercent) {
        this.allowancePercent = allowancePercent;
    }

    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(BigDecimal minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}