package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

public class OrderCanceledState extends OrderState {
    @Override
    public void notifyStatusChange(Order order) {
        this.subscribers.forEach( (s) -> s.orderCanceled(order));
    }
}
