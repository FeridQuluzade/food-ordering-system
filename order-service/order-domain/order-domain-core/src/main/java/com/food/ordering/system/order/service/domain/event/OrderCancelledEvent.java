package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {

    OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }

    public static OrderCancelledEvent of(Order order) {
        return new OrderCancelledEvent(order, ZonedDateTime.now(ZoneId.of("UTC")));
    }

}
