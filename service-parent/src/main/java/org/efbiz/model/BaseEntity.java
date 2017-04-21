package org.efbiz.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class BaseEntity implements Comparable<BaseEntity>, Serializable,Cloneable{
    
    /**
     * 
     */
    private static final long serialVersionUID = -2535965014380998528L;
    
    @Override
    public int compareTo(BaseEntity other) {
        return this.getCreatedStamp().compareTo(other.getCreatedStamp());
    }
    protected Date lastUpdatedStamp;
    protected Date lastUpdatedTxStamp;
    protected Date createdStamp;
    protected Date createdTxStamp;
}
