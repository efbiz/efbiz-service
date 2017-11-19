package org.efbiz.common.domain.model;

public interface DomainEventSubscriber<T> {

    public void handleEvent(final T aDomainEvent);

    public Class<T> subscribedToEventType();
}
