package org.efbiz.common.event.sourcing;

import java.util.List;

import org.efbiz.common.domain.model.DomainEvent;


public interface EventStream {

    public List<DomainEvent> events();

    public int version();
}
