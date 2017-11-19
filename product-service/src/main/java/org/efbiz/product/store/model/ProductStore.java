package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;

import org.efbiz.common.model.ObjectValue;

public class ProductStore extends ObjectValue implements Serializable {
    private String productStoreId;

    private String primaryStoreGroupId;

    private String storeName;

    private String companyName;

    private String title;

    private String subtitle;

    private String payToPartyId;

    private BigDecimal daysToCancelNonPay;

    private String manualAuthIsCapture;

    private String prorateShipping;

    private String prorateTaxes;

    private String viewCartOnAdd;

    private String autoSaveCart;

    private String autoApproveReviews;

    private String isDemoStore;

    private String isImmediatelyFulfilled;

    private String inventoryFacilityId;

    private String oneInventoryFacility;

    private String checkInventory;

    private String reserveInventory;

    private String reserveOrderEnumId;

    private String requireInventory;

    private String balanceResOnOrderCreation;

    private String requirementMethodEnumId;

    private String orderNumberPrefix;

    private String defaultLocaleString;

    private String defaultCurrencyUomId;

    private String defaultTimeZoneString;

    private String defaultSalesChannelEnumId;

    private String allowPassword;

    private String defaultPassword;

    private String explodeOrderItems;

    private String checkGcBalance;

    private String retryFailedAuths;

    private String headerApprovedStatus;

    private String itemApprovedStatus;

    private String digitalItemApprovedStatus;

    private String headerDeclinedStatus;

    private String itemDeclinedStatus;

    private String headerCancelStatus;

    private String itemCancelStatus;

    private String authDeclinedMessage;

    private String authFraudMessage;

    private String authErrorMessage;

    private String visualThemeId;

    private String storeCreditAccountEnumId;

    private String usePrimaryEmailUsername;

    private String requireCustomerRole;

    private String autoInvoiceDigitalItems;

    private String reqShipAddrForDigItems;

    private String showCheckoutGiftOptions;

    private String selectPaymentTypePerItem;

    private String showPricesWithVatTax;

    private String showTaxIsExempt;

    private String vatTaxAuthGeoId;

    private String vatTaxAuthPartyId;

    private String enableAutoSuggestionList;

    private String enableDigProdUpload;

    private String prodSearchExcludeVariants;

    private String digProdUploadCategoryId;

    private String autoOrderCcTryExp;

    private String autoOrderCcTryOtherCards;

    private String autoOrderCcTryLaterNsf;

    private BigDecimal autoOrderCcTryLaterMax;

    private BigDecimal storeCreditValidDays;

    private String autoApproveInvoice;

    private String autoApproveOrder;

    private String shipIfCaptureFails;

    private String setOwnerUponIssuance;

    private String reqReturnInventoryReceive;

    private String addToCartRemoveIncompat;

    private String addToCartReplaceUpsell;

    private String splitPayPrefPerShpGrp;

    private String managedByLot;

    private String showOutOfStockProducts;

    private String orderDecimalQuantity;

    private String allowComment;

    private String styleSheet;

    private String headerLogo;

    private String headerMiddleBackground;

    private String headerRightBackground;

    private static final long serialVersionUID = 1L;

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getPrimaryStoreGroupId() {
        return primaryStoreGroupId;
    }

    public void setPrimaryStoreGroupId(String primaryStoreGroupId) {
        this.primaryStoreGroupId = primaryStoreGroupId == null ? null : primaryStoreGroupId.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getPayToPartyId() {
        return payToPartyId;
    }

    public void setPayToPartyId(String payToPartyId) {
        this.payToPartyId = payToPartyId == null ? null : payToPartyId.trim();
    }

    public BigDecimal getDaysToCancelNonPay() {
        return daysToCancelNonPay;
    }

    public void setDaysToCancelNonPay(BigDecimal daysToCancelNonPay) {
        this.daysToCancelNonPay = daysToCancelNonPay;
    }

    public String getManualAuthIsCapture() {
        return manualAuthIsCapture;
    }

    public void setManualAuthIsCapture(String manualAuthIsCapture) {
        this.manualAuthIsCapture = manualAuthIsCapture == null ? null : manualAuthIsCapture.trim();
    }

    public String getProrateShipping() {
        return prorateShipping;
    }

    public void setProrateShipping(String prorateShipping) {
        this.prorateShipping = prorateShipping == null ? null : prorateShipping.trim();
    }

    public String getProrateTaxes() {
        return prorateTaxes;
    }

    public void setProrateTaxes(String prorateTaxes) {
        this.prorateTaxes = prorateTaxes == null ? null : prorateTaxes.trim();
    }

    public String getViewCartOnAdd() {
        return viewCartOnAdd;
    }

    public void setViewCartOnAdd(String viewCartOnAdd) {
        this.viewCartOnAdd = viewCartOnAdd == null ? null : viewCartOnAdd.trim();
    }

    public String getAutoSaveCart() {
        return autoSaveCart;
    }

    public void setAutoSaveCart(String autoSaveCart) {
        this.autoSaveCart = autoSaveCart == null ? null : autoSaveCart.trim();
    }

    public String getAutoApproveReviews() {
        return autoApproveReviews;
    }

    public void setAutoApproveReviews(String autoApproveReviews) {
        this.autoApproveReviews = autoApproveReviews == null ? null : autoApproveReviews.trim();
    }

    public String getIsDemoStore() {
        return isDemoStore;
    }

    public void setIsDemoStore(String isDemoStore) {
        this.isDemoStore = isDemoStore == null ? null : isDemoStore.trim();
    }

    public String getIsImmediatelyFulfilled() {
        return isImmediatelyFulfilled;
    }

    public void setIsImmediatelyFulfilled(String isImmediatelyFulfilled) {
        this.isImmediatelyFulfilled = isImmediatelyFulfilled == null ? null : isImmediatelyFulfilled.trim();
    }

    public String getInventoryFacilityId() {
        return inventoryFacilityId;
    }

    public void setInventoryFacilityId(String inventoryFacilityId) {
        this.inventoryFacilityId = inventoryFacilityId == null ? null : inventoryFacilityId.trim();
    }

    public String getOneInventoryFacility() {
        return oneInventoryFacility;
    }

    public void setOneInventoryFacility(String oneInventoryFacility) {
        this.oneInventoryFacility = oneInventoryFacility == null ? null : oneInventoryFacility.trim();
    }

    public String getCheckInventory() {
        return checkInventory;
    }

    public void setCheckInventory(String checkInventory) {
        this.checkInventory = checkInventory == null ? null : checkInventory.trim();
    }

    public String getReserveInventory() {
        return reserveInventory;
    }

    public void setReserveInventory(String reserveInventory) {
        this.reserveInventory = reserveInventory == null ? null : reserveInventory.trim();
    }

    public String getReserveOrderEnumId() {
        return reserveOrderEnumId;
    }

    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId == null ? null : reserveOrderEnumId.trim();
    }

    public String getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory == null ? null : requireInventory.trim();
    }

    public String getBalanceResOnOrderCreation() {
        return balanceResOnOrderCreation;
    }

    public void setBalanceResOnOrderCreation(String balanceResOnOrderCreation) {
        this.balanceResOnOrderCreation = balanceResOnOrderCreation == null ? null : balanceResOnOrderCreation.trim();
    }

    public String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId == null ? null : requirementMethodEnumId.trim();
    }

    public String getOrderNumberPrefix() {
        return orderNumberPrefix;
    }

    public void setOrderNumberPrefix(String orderNumberPrefix) {
        this.orderNumberPrefix = orderNumberPrefix == null ? null : orderNumberPrefix.trim();
    }

    public String getDefaultLocaleString() {
        return defaultLocaleString;
    }

    public void setDefaultLocaleString(String defaultLocaleString) {
        this.defaultLocaleString = defaultLocaleString == null ? null : defaultLocaleString.trim();
    }

    public String getDefaultCurrencyUomId() {
        return defaultCurrencyUomId;
    }

    public void setDefaultCurrencyUomId(String defaultCurrencyUomId) {
        this.defaultCurrencyUomId = defaultCurrencyUomId == null ? null : defaultCurrencyUomId.trim();
    }

    public String getDefaultTimeZoneString() {
        return defaultTimeZoneString;
    }

    public void setDefaultTimeZoneString(String defaultTimeZoneString) {
        this.defaultTimeZoneString = defaultTimeZoneString == null ? null : defaultTimeZoneString.trim();
    }

    public String getDefaultSalesChannelEnumId() {
        return defaultSalesChannelEnumId;
    }

    public void setDefaultSalesChannelEnumId(String defaultSalesChannelEnumId) {
        this.defaultSalesChannelEnumId = defaultSalesChannelEnumId == null ? null : defaultSalesChannelEnumId.trim();
    }

    public String getAllowPassword() {
        return allowPassword;
    }

    public void setAllowPassword(String allowPassword) {
        this.allowPassword = allowPassword == null ? null : allowPassword.trim();
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword == null ? null : defaultPassword.trim();
    }

    public String getExplodeOrderItems() {
        return explodeOrderItems;
    }

    public void setExplodeOrderItems(String explodeOrderItems) {
        this.explodeOrderItems = explodeOrderItems == null ? null : explodeOrderItems.trim();
    }

    public String getCheckGcBalance() {
        return checkGcBalance;
    }

    public void setCheckGcBalance(String checkGcBalance) {
        this.checkGcBalance = checkGcBalance == null ? null : checkGcBalance.trim();
    }

    public String getRetryFailedAuths() {
        return retryFailedAuths;
    }

    public void setRetryFailedAuths(String retryFailedAuths) {
        this.retryFailedAuths = retryFailedAuths == null ? null : retryFailedAuths.trim();
    }

    public String getHeaderApprovedStatus() {
        return headerApprovedStatus;
    }

    public void setHeaderApprovedStatus(String headerApprovedStatus) {
        this.headerApprovedStatus = headerApprovedStatus == null ? null : headerApprovedStatus.trim();
    }

    public String getItemApprovedStatus() {
        return itemApprovedStatus;
    }

    public void setItemApprovedStatus(String itemApprovedStatus) {
        this.itemApprovedStatus = itemApprovedStatus == null ? null : itemApprovedStatus.trim();
    }

    public String getDigitalItemApprovedStatus() {
        return digitalItemApprovedStatus;
    }

    public void setDigitalItemApprovedStatus(String digitalItemApprovedStatus) {
        this.digitalItemApprovedStatus = digitalItemApprovedStatus == null ? null : digitalItemApprovedStatus.trim();
    }

    public String getHeaderDeclinedStatus() {
        return headerDeclinedStatus;
    }

    public void setHeaderDeclinedStatus(String headerDeclinedStatus) {
        this.headerDeclinedStatus = headerDeclinedStatus == null ? null : headerDeclinedStatus.trim();
    }

    public String getItemDeclinedStatus() {
        return itemDeclinedStatus;
    }

    public void setItemDeclinedStatus(String itemDeclinedStatus) {
        this.itemDeclinedStatus = itemDeclinedStatus == null ? null : itemDeclinedStatus.trim();
    }

    public String getHeaderCancelStatus() {
        return headerCancelStatus;
    }

    public void setHeaderCancelStatus(String headerCancelStatus) {
        this.headerCancelStatus = headerCancelStatus == null ? null : headerCancelStatus.trim();
    }

    public String getItemCancelStatus() {
        return itemCancelStatus;
    }

    public void setItemCancelStatus(String itemCancelStatus) {
        this.itemCancelStatus = itemCancelStatus == null ? null : itemCancelStatus.trim();
    }

    public String getAuthDeclinedMessage() {
        return authDeclinedMessage;
    }

    public void setAuthDeclinedMessage(String authDeclinedMessage) {
        this.authDeclinedMessage = authDeclinedMessage == null ? null : authDeclinedMessage.trim();
    }

    public String getAuthFraudMessage() {
        return authFraudMessage;
    }

    public void setAuthFraudMessage(String authFraudMessage) {
        this.authFraudMessage = authFraudMessage == null ? null : authFraudMessage.trim();
    }

    public String getAuthErrorMessage() {
        return authErrorMessage;
    }

    public void setAuthErrorMessage(String authErrorMessage) {
        this.authErrorMessage = authErrorMessage == null ? null : authErrorMessage.trim();
    }

    public String getVisualThemeId() {
        return visualThemeId;
    }

    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId == null ? null : visualThemeId.trim();
    }

    public String getStoreCreditAccountEnumId() {
        return storeCreditAccountEnumId;
    }

    public void setStoreCreditAccountEnumId(String storeCreditAccountEnumId) {
        this.storeCreditAccountEnumId = storeCreditAccountEnumId == null ? null : storeCreditAccountEnumId.trim();
    }

    public String getUsePrimaryEmailUsername() {
        return usePrimaryEmailUsername;
    }

    public void setUsePrimaryEmailUsername(String usePrimaryEmailUsername) {
        this.usePrimaryEmailUsername = usePrimaryEmailUsername == null ? null : usePrimaryEmailUsername.trim();
    }

    public String getRequireCustomerRole() {
        return requireCustomerRole;
    }

    public void setRequireCustomerRole(String requireCustomerRole) {
        this.requireCustomerRole = requireCustomerRole == null ? null : requireCustomerRole.trim();
    }

    public String getAutoInvoiceDigitalItems() {
        return autoInvoiceDigitalItems;
    }

    public void setAutoInvoiceDigitalItems(String autoInvoiceDigitalItems) {
        this.autoInvoiceDigitalItems = autoInvoiceDigitalItems == null ? null : autoInvoiceDigitalItems.trim();
    }

    public String getReqShipAddrForDigItems() {
        return reqShipAddrForDigItems;
    }

    public void setReqShipAddrForDigItems(String reqShipAddrForDigItems) {
        this.reqShipAddrForDigItems = reqShipAddrForDigItems == null ? null : reqShipAddrForDigItems.trim();
    }

    public String getShowCheckoutGiftOptions() {
        return showCheckoutGiftOptions;
    }

    public void setShowCheckoutGiftOptions(String showCheckoutGiftOptions) {
        this.showCheckoutGiftOptions = showCheckoutGiftOptions == null ? null : showCheckoutGiftOptions.trim();
    }

    public String getSelectPaymentTypePerItem() {
        return selectPaymentTypePerItem;
    }

    public void setSelectPaymentTypePerItem(String selectPaymentTypePerItem) {
        this.selectPaymentTypePerItem = selectPaymentTypePerItem == null ? null : selectPaymentTypePerItem.trim();
    }

    public String getShowPricesWithVatTax() {
        return showPricesWithVatTax;
    }

    public void setShowPricesWithVatTax(String showPricesWithVatTax) {
        this.showPricesWithVatTax = showPricesWithVatTax == null ? null : showPricesWithVatTax.trim();
    }

    public String getShowTaxIsExempt() {
        return showTaxIsExempt;
    }

    public void setShowTaxIsExempt(String showTaxIsExempt) {
        this.showTaxIsExempt = showTaxIsExempt == null ? null : showTaxIsExempt.trim();
    }

    public String getVatTaxAuthGeoId() {
        return vatTaxAuthGeoId;
    }

    public void setVatTaxAuthGeoId(String vatTaxAuthGeoId) {
        this.vatTaxAuthGeoId = vatTaxAuthGeoId == null ? null : vatTaxAuthGeoId.trim();
    }

    public String getVatTaxAuthPartyId() {
        return vatTaxAuthPartyId;
    }

    public void setVatTaxAuthPartyId(String vatTaxAuthPartyId) {
        this.vatTaxAuthPartyId = vatTaxAuthPartyId == null ? null : vatTaxAuthPartyId.trim();
    }

    public String getEnableAutoSuggestionList() {
        return enableAutoSuggestionList;
    }

    public void setEnableAutoSuggestionList(String enableAutoSuggestionList) {
        this.enableAutoSuggestionList = enableAutoSuggestionList == null ? null : enableAutoSuggestionList.trim();
    }

    public String getEnableDigProdUpload() {
        return enableDigProdUpload;
    }

    public void setEnableDigProdUpload(String enableDigProdUpload) {
        this.enableDigProdUpload = enableDigProdUpload == null ? null : enableDigProdUpload.trim();
    }

    public String getProdSearchExcludeVariants() {
        return prodSearchExcludeVariants;
    }

    public void setProdSearchExcludeVariants(String prodSearchExcludeVariants) {
        this.prodSearchExcludeVariants = prodSearchExcludeVariants == null ? null : prodSearchExcludeVariants.trim();
    }

    public String getDigProdUploadCategoryId() {
        return digProdUploadCategoryId;
    }

    public void setDigProdUploadCategoryId(String digProdUploadCategoryId) {
        this.digProdUploadCategoryId = digProdUploadCategoryId == null ? null : digProdUploadCategoryId.trim();
    }

    public String getAutoOrderCcTryExp() {
        return autoOrderCcTryExp;
    }

    public void setAutoOrderCcTryExp(String autoOrderCcTryExp) {
        this.autoOrderCcTryExp = autoOrderCcTryExp == null ? null : autoOrderCcTryExp.trim();
    }

    public String getAutoOrderCcTryOtherCards() {
        return autoOrderCcTryOtherCards;
    }

    public void setAutoOrderCcTryOtherCards(String autoOrderCcTryOtherCards) {
        this.autoOrderCcTryOtherCards = autoOrderCcTryOtherCards == null ? null : autoOrderCcTryOtherCards.trim();
    }

    public String getAutoOrderCcTryLaterNsf() {
        return autoOrderCcTryLaterNsf;
    }

    public void setAutoOrderCcTryLaterNsf(String autoOrderCcTryLaterNsf) {
        this.autoOrderCcTryLaterNsf = autoOrderCcTryLaterNsf == null ? null : autoOrderCcTryLaterNsf.trim();
    }

    public BigDecimal getAutoOrderCcTryLaterMax() {
        return autoOrderCcTryLaterMax;
    }

    public void setAutoOrderCcTryLaterMax(BigDecimal autoOrderCcTryLaterMax) {
        this.autoOrderCcTryLaterMax = autoOrderCcTryLaterMax;
    }

    public BigDecimal getStoreCreditValidDays() {
        return storeCreditValidDays;
    }

    public void setStoreCreditValidDays(BigDecimal storeCreditValidDays) {
        this.storeCreditValidDays = storeCreditValidDays;
    }

    public String getAutoApproveInvoice() {
        return autoApproveInvoice;
    }

    public void setAutoApproveInvoice(String autoApproveInvoice) {
        this.autoApproveInvoice = autoApproveInvoice == null ? null : autoApproveInvoice.trim();
    }

    public String getAutoApproveOrder() {
        return autoApproveOrder;
    }

    public void setAutoApproveOrder(String autoApproveOrder) {
        this.autoApproveOrder = autoApproveOrder == null ? null : autoApproveOrder.trim();
    }

    public String getShipIfCaptureFails() {
        return shipIfCaptureFails;
    }

    public void setShipIfCaptureFails(String shipIfCaptureFails) {
        this.shipIfCaptureFails = shipIfCaptureFails == null ? null : shipIfCaptureFails.trim();
    }

    public String getSetOwnerUponIssuance() {
        return setOwnerUponIssuance;
    }

    public void setSetOwnerUponIssuance(String setOwnerUponIssuance) {
        this.setOwnerUponIssuance = setOwnerUponIssuance == null ? null : setOwnerUponIssuance.trim();
    }

    public String getReqReturnInventoryReceive() {
        return reqReturnInventoryReceive;
    }

    public void setReqReturnInventoryReceive(String reqReturnInventoryReceive) {
        this.reqReturnInventoryReceive = reqReturnInventoryReceive == null ? null : reqReturnInventoryReceive.trim();
    }

    public String getAddToCartRemoveIncompat() {
        return addToCartRemoveIncompat;
    }

    public void setAddToCartRemoveIncompat(String addToCartRemoveIncompat) {
        this.addToCartRemoveIncompat = addToCartRemoveIncompat == null ? null : addToCartRemoveIncompat.trim();
    }

    public String getAddToCartReplaceUpsell() {
        return addToCartReplaceUpsell;
    }

    public void setAddToCartReplaceUpsell(String addToCartReplaceUpsell) {
        this.addToCartReplaceUpsell = addToCartReplaceUpsell == null ? null : addToCartReplaceUpsell.trim();
    }

    public String getSplitPayPrefPerShpGrp() {
        return splitPayPrefPerShpGrp;
    }

    public void setSplitPayPrefPerShpGrp(String splitPayPrefPerShpGrp) {
        this.splitPayPrefPerShpGrp = splitPayPrefPerShpGrp == null ? null : splitPayPrefPerShpGrp.trim();
    }

    public String getManagedByLot() {
        return managedByLot;
    }

    public void setManagedByLot(String managedByLot) {
        this.managedByLot = managedByLot == null ? null : managedByLot.trim();
    }

    public String getShowOutOfStockProducts() {
        return showOutOfStockProducts;
    }

    public void setShowOutOfStockProducts(String showOutOfStockProducts) {
        this.showOutOfStockProducts = showOutOfStockProducts == null ? null : showOutOfStockProducts.trim();
    }

    public String getOrderDecimalQuantity() {
        return orderDecimalQuantity;
    }

    public void setOrderDecimalQuantity(String orderDecimalQuantity) {
        this.orderDecimalQuantity = orderDecimalQuantity == null ? null : orderDecimalQuantity.trim();
    }

    public String getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(String allowComment) {
        this.allowComment = allowComment == null ? null : allowComment.trim();
    }

    public String getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet == null ? null : styleSheet.trim();
    }

    public String getHeaderLogo() {
        return headerLogo;
    }

    public void setHeaderLogo(String headerLogo) {
        this.headerLogo = headerLogo == null ? null : headerLogo.trim();
    }

    public String getHeaderMiddleBackground() {
        return headerMiddleBackground;
    }

    public void setHeaderMiddleBackground(String headerMiddleBackground) {
        this.headerMiddleBackground = headerMiddleBackground == null ? null : headerMiddleBackground.trim();
    }

    public String getHeaderRightBackground() {
        return headerRightBackground;
    }

    public void setHeaderRightBackground(String headerRightBackground) {
        this.headerRightBackground = headerRightBackground == null ? null : headerRightBackground.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}