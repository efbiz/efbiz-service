package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.facility.model.FacilityGroupRoleKey;

public class FacilityGroupRole extends FacilityGroupRoleKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}