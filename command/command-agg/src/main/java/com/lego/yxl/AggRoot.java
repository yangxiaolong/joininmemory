package com.lego.yxl;

import java.util.function.Consumer;

public interface AggRoot<ID> {
    ID getId();
    void consumeAndClearEvent(Consumer<DomainEvent> eventConsumer);

    default void validate(){

    }
}
