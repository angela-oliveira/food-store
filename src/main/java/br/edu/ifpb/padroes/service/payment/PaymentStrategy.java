package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.domain.Order;

public interface PaymentStrategy {
    public void pay(Order order);
}
