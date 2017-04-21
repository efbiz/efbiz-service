package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.product.model.ProductAssocKey;

public class ProductAssoc extends ProductAssocKey implements Serializable {
    private Date thruDate;

    private BigDecimal sequenceNum;

    private String reason;

    private BigDecimal quantity;

    private BigDecimal scrapFactor;

    private String instruction;

    private String routingWorkEffortId;

    private String estimateCalcMethod;

    private String recurrenceInfoId;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getScrapFactor() {
        return scrapFactor;
    }

    public void setScrapFactor(BigDecimal scrapFactor) {
        this.scrapFactor = scrapFactor;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getRoutingWorkEffortId() {
        return routingWorkEffortId;
    }

    public void setRoutingWorkEffortId(String routingWorkEffortId) {
        this.routingWorkEffortId = routingWorkEffortId == null ? null : routingWorkEffortId.trim();
    }

    public String getEstimateCalcMethod() {
        return estimateCalcMethod;
    }

    public void setEstimateCalcMethod(String estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod == null ? null : estimateCalcMethod.trim();
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId == null ? null : recurrenceInfoId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}