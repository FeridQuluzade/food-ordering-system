package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {

    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }

    public static OrderPaidEvent of(Order order) {
        return new OrderPaidEvent(order, ZonedDateTime.now(ZoneId.of("UTC")));
    }

}

