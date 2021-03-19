package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.domain.Order;

public class BilletPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        System.out.println("Do billet payment!");
    }
}
