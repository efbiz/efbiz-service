package org.efbiz.product.catalog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdCatalogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProdCatalogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProdCatalogIdIsNull() {
            addCriterion("PROD_CATALOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdIsNotNull() {
            addCriterion("PROD_CATALOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdEqualTo(String value) {
            addCriterion("PROD_CATALOG_ID =", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdNotEqualTo(String value) {
            addCriterion("PROD_CATALOG_ID <>", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdGreaterThan(String value) {
            addCriterion("PROD_CATALOG_ID >", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CATALOG_ID >=", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdLessThan(String value) {
            addCriterion("PROD_CATALOG_ID <", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdLessThanOrEqualTo(String value) {
            addCriterion("PROD_CATALOG_ID <=", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdLike(String value) {
            addCriterion("PROD_CATALOG_ID like", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdNotLike(String value) {
            addCriterion("PROD_CATALOG_ID not like", value, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdIn(List<String> values) {
            addCriterion("PROD_CATALOG_ID in", values, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdNotIn(List<String> values) {
            addCriterion("PROD_CATALOG_ID not in", values, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdBetween(String value1, String value2) {
            addCriterion("PROD_CATALOG_ID between", value1, value2, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andProdCatalogIdNotBetween(String value1, String value2) {
            addCriterion("PROD_CATALOG_ID not between", value1, value2, "prodCatalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogNameIsNull() {
            addCriterion("CATALOG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCatalogNameIsNotNull() {
            addCriterion("CATALOG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogNameEqualTo(String value) {
            addCriterion("CATALOG_NAME =", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotEqualTo(String value) {
            addCriterion("CATALOG_NAME <>", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameGreaterThan(String value) {
            addCriterion("CATALOG_NAME >", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATALOG_NAME >=", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameLessThan(String value) {
            addCriterion("CATALOG_NAME <", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameLessThanOrEqualTo(String value) {
            addCriterion("CATALOG_NAME <=", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameLike(String value) {
            addCriterion("CATALOG_NAME like", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotLike(String value) {
            addCriterion("CATALOG_NAME not like", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameIn(List<String> values) {
            addCriterion("CATALOG_NAME in", values, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotIn(List<String> values) {
            addCriterion("CATALOG_NAME not in", values, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameBetween(String value1, String value2) {
            addCriterion("CATALOG_NAME between", value1, value2, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotBetween(String value1, String value2) {
            addCriterion("CATALOG_NAME not between", value1, value2, "catalogName");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddIsNull() {
            addCriterion("USE_QUICK_ADD is null");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddIsNotNull() {
            addCriterion("USE_QUICK_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddEqualTo(String value) {
            addCriterion("USE_QUICK_ADD =", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddNotEqualTo(String value) {
            addCriterion("USE_QUICK_ADD <>", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddGreaterThan(String value) {
            addCriterion("USE_QUICK_ADD >", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddGreaterThanOrEqualTo(String value) {
            addCriterion("USE_QUICK_ADD >=", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddLessThan(String value) {
            addCriterion("USE_QUICK_ADD <", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddLessThanOrEqualTo(String value) {
            addCriterion("USE_QUICK_ADD <=", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddLike(String value) {
            addCriterion("USE_QUICK_ADD like", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddNotLike(String value) {
            addCriterion("USE_QUICK_ADD not like", value, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddIn(List<String> values) {
            addCriterion("USE_QUICK_ADD in", values, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddNotIn(List<String> values) {
            addCriterion("USE_QUICK_ADD not in", values, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddBetween(String value1, String value2) {
            addCriterion("USE_QUICK_ADD between", value1, value2, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andUseQuickAddNotBetween(String value1, String value2) {
            addCriterion("USE_QUICK_ADD not between", value1, value2, "useQuickAdd");
            return (Criteria) this;
        }

        public Criteria andStyleSheetIsNull() {
            addCriterion("STYLE_SHEET is null");
            return (Criteria) this;
        }

        public Criteria andStyleSheetIsNotNull() {
            addCriterion("STYLE_SHEET is not null");
            return (Criteria) this;
        }

        public Criteria andStyleSheetEqualTo(String value) {
            addCriterion("STYLE_SHEET =", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotEqualTo(String value) {
            addCriterion("STYLE_SHEET <>", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetGreaterThan(String value) {
            addCriterion("STYLE_SHEET >", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_SHEET >=", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetLessThan(String value) {
            addCriterion("STYLE_SHEET <", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetLessThanOrEqualTo(String value) {
            addCriterion("STYLE_SHEET <=", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetLike(String value) {
            addCriterion("STYLE_SHEET like", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotLike(String value) {
            addCriterion("STYLE_SHEET not like", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetIn(List<String> values) {
            addCriterion("STYLE_SHEET in", values, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotIn(List<String> values) {
            addCriterion("STYLE_SHEET not in", values, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetBetween(String value1, String value2) {
            addCriterion("STYLE_SHEET between", value1, value2, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotBetween(String value1, String value2) {
            addCriterion("STYLE_SHEET not between", value1, value2, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoIsNull() {
            addCriterion("HEADER_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoIsNotNull() {
            addCriterion("HEADER_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoEqualTo(String value) {
            addCriterion("HEADER_LOGO =", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotEqualTo(String value) {
            addCriterion("HEADER_LOGO <>", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoGreaterThan(String value) {
            addCriterion("HEADER_LOGO >", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_LOGO >=", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoLessThan(String value) {
            addCriterion("HEADER_LOGO <", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoLessThanOrEqualTo(String value) {
            addCriterion("HEADER_LOGO <=", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoLike(String value) {
            addCriterion("HEADER_LOGO like", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotLike(String value) {
            addCriterion("HEADER_LOGO not like", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoIn(List<String> values) {
            addCriterion("HEADER_LOGO in", values, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotIn(List<String> values) {
            addCriterion("HEADER_LOGO not in", values, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoBetween(String value1, String value2) {
            addCriterion("HEADER_LOGO between", value1, value2, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotBetween(String value1, String value2) {
            addCriterion("HEADER_LOGO not between", value1, value2, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixIsNull() {
            addCriterion("CONTENT_PATH_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixIsNotNull() {
            addCriterion("CONTENT_PATH_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixEqualTo(String value) {
            addCriterion("CONTENT_PATH_PREFIX =", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixNotEqualTo(String value) {
            addCriterion("CONTENT_PATH_PREFIX <>", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixGreaterThan(String value) {
            addCriterion("CONTENT_PATH_PREFIX >", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_PATH_PREFIX >=", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixLessThan(String value) {
            addCriterion("CONTENT_PATH_PREFIX <", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_PATH_PREFIX <=", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixLike(String value) {
            addCriterion("CONTENT_PATH_PREFIX like", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixNotLike(String value) {
            addCriterion("CONTENT_PATH_PREFIX not like", value, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixIn(List<String> values) {
            addCriterion("CONTENT_PATH_PREFIX in", values, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixNotIn(List<String> values) {
            addCriterion("CONTENT_PATH_PREFIX not in", values, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixBetween(String value1, String value2) {
            addCriterion("CONTENT_PATH_PREFIX between", value1, value2, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andContentPathPrefixNotBetween(String value1, String value2) {
            addCriterion("CONTENT_PATH_PREFIX not between", value1, value2, "contentPathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixIsNull() {
            addCriterion("TEMPLATE_PATH_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixIsNotNull() {
            addCriterion("TEMPLATE_PATH_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixEqualTo(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX =", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixNotEqualTo(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX <>", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixGreaterThan(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX >", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX >=", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixLessThan(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX <", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX <=", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixLike(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX like", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixNotLike(String value) {
            addCriterion("TEMPLATE_PATH_PREFIX not like", value, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixIn(List<String> values) {
            addCriterion("TEMPLATE_PATH_PREFIX in", values, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixNotIn(List<String> values) {
            addCriterion("TEMPLATE_PATH_PREFIX not in", values, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixBetween(String value1, String value2) {
            addCriterion("TEMPLATE_PATH_PREFIX between", value1, value2, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andTemplatePathPrefixNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_PATH_PREFIX not between", value1, value2, "templatePathPrefix");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdIsNull() {
            addCriterion("VIEW_ALLOW_PERM_REQD is null");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdIsNotNull() {
            addCriterion("VIEW_ALLOW_PERM_REQD is not null");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdEqualTo(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD =", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdNotEqualTo(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD <>", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdGreaterThan(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD >", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD >=", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdLessThan(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD <", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdLessThanOrEqualTo(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD <=", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdLike(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD like", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdNotLike(String value) {
            addCriterion("VIEW_ALLOW_PERM_REQD not like", value, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdIn(List<String> values) {
            addCriterion("VIEW_ALLOW_PERM_REQD in", values, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdNotIn(List<String> values) {
            addCriterion("VIEW_ALLOW_PERM_REQD not in", values, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdBetween(String value1, String value2) {
            addCriterion("VIEW_ALLOW_PERM_REQD between", value1, value2, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andViewAllowPermReqdNotBetween(String value1, String value2) {
            addCriterion("VIEW_ALLOW_PERM_REQD not between", value1, value2, "viewAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdIsNull() {
            addCriterion("PURCHASE_ALLOW_PERM_REQD is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdIsNotNull() {
            addCriterion("PURCHASE_ALLOW_PERM_REQD is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdEqualTo(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD =", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdNotEqualTo(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD <>", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdGreaterThan(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD >", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD >=", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdLessThan(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD <", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD <=", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdLike(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD like", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdNotLike(String value) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD not like", value, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdIn(List<String> values) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD in", values, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdNotIn(List<String> values) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD not in", values, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdBetween(String value1, String value2) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD between", value1, value2, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andPurchaseAllowPermReqdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ALLOW_PERM_REQD not between", value1, value2, "purchaseAllowPermReqd");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNull() {
            addCriterion("LAST_UPDATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNotNull() {
            addCriterion("LAST_UPDATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP =", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <>", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP >", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP >=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP <", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP not in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP not between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNotNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP =", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <>", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP not in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP not between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNull() {
            addCriterion("CREATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNotNull() {
            addCriterion("CREATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampEqualTo(Date value) {
            addCriterion("CREATED_STAMP =", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotEqualTo(Date value) {
            addCriterion("CREATED_STAMP <>", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThan(Date value) {
            addCriterion("CREATED_STAMP >", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP >=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThan(Date value) {
            addCriterion("CREATED_STAMP <", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP <=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIn(List<Date> values) {
            addCriterion("CREATED_STAMP in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotIn(List<Date> values) {
            addCriterion("CREATED_STAMP not in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP not between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNull() {
            addCriterion("CREATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNotNull() {
            addCriterion("CREATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP =", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <>", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThan(Date value) {
            addCriterion("CREATED_TX_STAMP >", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP >=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThan(Date value) {
            addCriterion("CREATED_TX_STAMP <", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP not in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP not between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}