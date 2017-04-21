package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.price.model.ProductPriceKey;

public class ProductPrice extends ProductPriceKey implements Serializable {
    private Date thruDate;

    private BigDecimal price;

    private String termUomId;

    private String customPriceCalcService;

    private BigDecimal priceWithoutTax;

    private BigDecimal priceWithTax;

    private BigDecimal taxAmount;

    private BigDecimal taxPercentage;

    private String taxAuthPartyId;

    private String taxAuthGeoId;

    private String taxInPrice;

    private Date createdDate;

    private String createdByUserLogin;

    private Date lastModifiedDate;

    private String lastModifiedByUserLogin;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTermUomId() {
        return termUomId;
    }

    public void setTermUomId(String termUomId) {
        this.termUomId = termUomId == null ? null : termUomId.trim();
    }

    public String getCustomPriceCalcService() {
        return customPriceCalcService;
    }

    public void setCustomPriceCalcService(String customPriceCalcService) {
        this.customPriceCalcService = customPriceCalcService == null ? null : customPriceCalcService.trim();
    }

    public BigDecimal getPriceWithoutTax() {
        return priceWithoutTax;
    }

    public void setPriceWithoutTax(BigDecimal priceWithoutTax) {
        this.priceWithoutTax = priceWithoutTax;
    }

    public BigDecimal getPriceWithTax() {
        return priceWithTax;
    }

    public void setPriceWithTax(BigDecimal priceWithTax) {
        this.priceWithTax = priceWithTax;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId == null ? null : taxAuthPartyId.trim();
    }

    public String getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId == null ? null : taxAuthGeoId.trim();
    }

    public String getTaxInPrice() {
        return taxInPrice;
    }

    public void setTaxInPrice(String taxInPrice) {
        this.taxInPrice = taxInPrice == null ? null : taxInPrice.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin == null ? null : createdByUserLogin.trim();
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin == null ? null : lastModifiedByUserLogin.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}