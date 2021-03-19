package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class OrderState {

    protected List<OrderStateSubscriber> subscribers = new ArrayList<>();

    public abstract void notifyStatusChange(Order order);

    public void addSubscriber(OrderStateSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(OrderStateSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

}
