package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.config.model.ProductConfigProductKey;

public class ProductConfigProduct extends ProductConfigProductKey implements Serializable {
    private BigDecimal quantity;

    private BigDecimal sequenceNum;

    private static final long serialVersionUID = 1L;

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}