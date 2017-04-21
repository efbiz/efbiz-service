package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class Product extends BaseEntity implements Serializable {
    private String productId;

    private String productTypeId;

    private String primaryProductCategoryId;

    private String manufacturerPartyId;

    private String facilityId;

    private Date introductionDate;

    private Date releaseDate;

    private Date supportDiscontinuationDate;

    private Date salesDiscontinuationDate;

    private String salesDiscWhenNotAvail;

    private String internalName;

    private String brandName;

    private String comments;

    private String productName;

    private String description;

    private String priceDetailText;

    private String smallImageUrl;

    private String mediumImageUrl;

    private String largeImageUrl;

    private String detailImageUrl;

    private String originalImageUrl;

    private String detailScreen;

    private String inventoryMessage;

    private String inventoryItemTypeId;

    private String requireInventory;

    private String quantityUomId;

    private BigDecimal quantityIncluded;

    private BigDecimal piecesIncluded;

    private String requireAmount;

    private BigDecimal fixedAmount;

    private String amountUomTypeId;

    private String weightUomId;

    private BigDecimal shippingWeight;

    private BigDecimal productWeight;

    private String heightUomId;

    private BigDecimal productHeight;

    private BigDecimal shippingHeight;

    private String widthUomId;

    private BigDecimal productWidth;

    private BigDecimal shippingWidth;

    private String depthUomId;

    private BigDecimal productDepth;

    private BigDecimal shippingDepth;

    private String diameterUomId;

    private BigDecimal productDiameter;

    private BigDecimal productRating;

    private String ratingTypeEnum;

    private String returnable;

    private String taxable;

    private String chargeShipping;

    private String autoCreateKeywords;

    private String includeInPromotions;

    private String isVirtual;

    private String isVariant;

    private String virtualVariantMethodEnum;

    private String originGeoId;

    private String requirementMethodEnumId;

    private BigDecimal billOfMaterialLevel;

    private BigDecimal reservMaxPersons;

    private BigDecimal reserv2ndPPPerc;

    private BigDecimal reservNthPPPerc;

    private String configId;

    private Date createdDate;

    private String createdByUserLogin;

    private Date lastModifiedDate;

    private String lastModifiedByUserLogin;

    private String inShippingBox;

    private String defaultShipmentBoxTypeId;

    private String lotIdFilledIn;

    private String orderDecimalQuantity;

    private String longDescription;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId == null ? null : productTypeId.trim();
    }

    public String getPrimaryProductCategoryId() {
        return primaryProductCategoryId;
    }

    public void setPrimaryProductCategoryId(String primaryProductCategoryId) {
        this.primaryProductCategoryId = primaryProductCategoryId == null ? null : primaryProductCategoryId.trim();
    }

    public String getManufacturerPartyId() {
        return manufacturerPartyId;
    }

    public void setManufacturerPartyId(String manufacturerPartyId) {
        this.manufacturerPartyId = manufacturerPartyId == null ? null : manufacturerPartyId.trim();
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public Date getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(Date introductionDate) {
        this.introductionDate = introductionDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getSupportDiscontinuationDate() {
        return supportDiscontinuationDate;
    }

    public void setSupportDiscontinuationDate(Date supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }

    public Date getSalesDiscontinuationDate() {
        return salesDiscontinuationDate;
    }

    public void setSalesDiscontinuationDate(Date salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }

    public String getSalesDiscWhenNotAvail() {
        return salesDiscWhenNotAvail;
    }

    public void setSalesDiscWhenNotAvail(String salesDiscWhenNotAvail) {
        this.salesDiscWhenNotAvail = salesDiscWhenNotAvail == null ? null : salesDiscWhenNotAvail.trim();
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName == null ? null : internalName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPriceDetailText() {
        return priceDetailText;
    }

    public void setPriceDetailText(String priceDetailText) {
        this.priceDetailText = priceDetailText == null ? null : priceDetailText.trim();
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl == null ? null : smallImageUrl.trim();
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl == null ? null : mediumImageUrl.trim();
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl == null ? null : largeImageUrl.trim();
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl == null ? null : detailImageUrl.trim();
    }

    public String getOriginalImageUrl() {
        return originalImageUrl;
    }

    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl == null ? null : originalImageUrl.trim();
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen == null ? null : detailScreen.trim();
    }

    public String getInventoryMessage() {
        return inventoryMessage;
    }

    public void setInventoryMessage(String inventoryMessage) {
        this.inventoryMessage = inventoryMessage == null ? null : inventoryMessage.trim();
    }

    public String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId == null ? null : inventoryItemTypeId.trim();
    }

    public String getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory == null ? null : requireInventory.trim();
    }

    public String getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId == null ? null : quantityUomId.trim();
    }

    public BigDecimal getQuantityIncluded() {
        return quantityIncluded;
    }

    public void setQuantityIncluded(BigDecimal quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    public BigDecimal getPiecesIncluded() {
        return piecesIncluded;
    }

    public void setPiecesIncluded(BigDecimal piecesIncluded) {
        this.piecesIncluded = piecesIncluded;
    }

    public String getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(String requireAmount) {
        this.requireAmount = requireAmount == null ? null : requireAmount.trim();
    }

    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public String getAmountUomTypeId() {
        return amountUomTypeId;
    }

    public void setAmountUomTypeId(String amountUomTypeId) {
        this.amountUomTypeId = amountUomTypeId == null ? null : amountUomTypeId.trim();
    }

    public String getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId == null ? null : weightUomId.trim();
    }

    public BigDecimal getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(BigDecimal shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public String getHeightUomId() {
        return heightUomId;
    }

    public void setHeightUomId(String heightUomId) {
        this.heightUomId = heightUomId == null ? null : heightUomId.trim();
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public BigDecimal getShippingHeight() {
        return shippingHeight;
    }

    public void setShippingHeight(BigDecimal shippingHeight) {
        this.shippingHeight = shippingHeight;
    }

    public String getWidthUomId() {
        return widthUomId;
    }

    public void setWidthUomId(String widthUomId) {
        this.widthUomId = widthUomId == null ? null : widthUomId.trim();
    }

    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getShippingWidth() {
        return shippingWidth;
    }

    public void setShippingWidth(BigDecimal shippingWidth) {
        this.shippingWidth = shippingWidth;
    }

    public String getDepthUomId() {
        return depthUomId;
    }

    public void setDepthUomId(String depthUomId) {
        this.depthUomId = depthUomId == null ? null : depthUomId.trim();
    }

    public BigDecimal getProductDepth() {
        return productDepth;
    }

    public void setProductDepth(BigDecimal productDepth) {
        this.productDepth = productDepth;
    }

    public BigDecimal getShippingDepth() {
        return shippingDepth;
    }

    public void setShippingDepth(BigDecimal shippingDepth) {
        this.shippingDepth = shippingDepth;
    }

    public String getDiameterUomId() {
        return diameterUomId;
    }

    public void setDiameterUomId(String diameterUomId) {
        this.diameterUomId = diameterUomId == null ? null : diameterUomId.trim();
    }

    public BigDecimal getProductDiameter() {
        return productDiameter;
    }

    public void setProductDiameter(BigDecimal productDiameter) {
        this.productDiameter = productDiameter;
    }

    public BigDecimal getProductRating() {
        return productRating;
    }

    public void setProductRating(BigDecimal productRating) {
        this.productRating = productRating;
    }

    public String getRatingTypeEnum() {
        return ratingTypeEnum;
    }

    public void setRatingTypeEnum(String ratingTypeEnum) {
        this.ratingTypeEnum = ratingTypeEnum == null ? null : ratingTypeEnum.trim();
    }

    public String getReturnable() {
        return returnable;
    }

    public void setReturnable(String returnable) {
        this.returnable = returnable == null ? null : returnable.trim();
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable == null ? null : taxable.trim();
    }

    public String getChargeShipping() {
        return chargeShipping;
    }

    public void setChargeShipping(String chargeShipping) {
        this.chargeShipping = chargeShipping == null ? null : chargeShipping.trim();
    }

    public String getAutoCreateKeywords() {
        return autoCreateKeywords;
    }

    public void setAutoCreateKeywords(String autoCreateKeywords) {
        this.autoCreateKeywords = autoCreateKeywords == null ? null : autoCreateKeywords.trim();
    }

    public String getIncludeInPromotions() {
        return includeInPromotions;
    }

    public void setIncludeInPromotions(String includeInPromotions) {
        this.includeInPromotions = includeInPromotions == null ? null : includeInPromotions.trim();
    }

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual == null ? null : isVirtual.trim();
    }

    public String getIsVariant() {
        return isVariant;
    }

    public void setIsVariant(String isVariant) {
        this.isVariant = isVariant == null ? null : isVariant.trim();
    }

    public String getVirtualVariantMethodEnum() {
        return virtualVariantMethodEnum;
    }

    public void setVirtualVariantMethodEnum(String virtualVariantMethodEnum) {
        this.virtualVariantMethodEnum = virtualVariantMethodEnum == null ? null : virtualVariantMethodEnum.trim();
    }

    public String getOriginGeoId() {
        return originGeoId;
    }

    public void setOriginGeoId(String originGeoId) {
        this.originGeoId = originGeoId == null ? null : originGeoId.trim();
    }

    public String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId == null ? null : requirementMethodEnumId.trim();
    }

    public BigDecimal getBillOfMaterialLevel() {
        return billOfMaterialLevel;
    }

    public void setBillOfMaterialLevel(BigDecimal billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }

    public BigDecimal getReservMaxPersons() {
        return reservMaxPersons;
    }

    public void setReservMaxPersons(BigDecimal reservMaxPersons) {
        this.reservMaxPersons = reservMaxPersons;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId == null ? null : configId.trim();
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

    public String getInShippingBox() {
        return inShippingBox;
    }

    public void setInShippingBox(String inShippingBox) {
        this.inShippingBox = inShippingBox == null ? null : inShippingBox.trim();
    }

    public String getDefaultShipmentBoxTypeId() {
        return defaultShipmentBoxTypeId;
    }

    public void setDefaultShipmentBoxTypeId(String defaultShipmentBoxTypeId) {
        this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId == null ? null : defaultShipmentBoxTypeId.trim();
    }

    public String getLotIdFilledIn() {
        return lotIdFilledIn;
    }

    public void setLotIdFilledIn(String lotIdFilledIn) {
        this.lotIdFilledIn = lotIdFilledIn == null ? null : lotIdFilledIn.trim();
    }

    public String getOrderDecimalQuantity() {
        return orderDecimalQuantity;
    }

    public void setOrderDecimalQuantity(String orderDecimalQuantity) {
        this.orderDecimalQuantity = orderDecimalQuantity == null ? null : orderDecimalQuantity.trim();
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription == null ? null : longDescription.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}