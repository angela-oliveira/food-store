package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

/**
 * Padrão Observer
 */
public interface OrderStateSubscriber {

    default void orderCreated(Order order) {
        //no message was triggered
    }

    default void orderCanceled(Order order) {
        //no message was triggered
    }

    default void orderCompleted(Order order) {
        //no message was triggered
    }

    default void orderRefused(Order order) {
        //no message was triggered
    }

}
