package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.domain.Order;

public class DebitPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(Order order) {
        System.out.println("Do debit payment!");
    }
}
