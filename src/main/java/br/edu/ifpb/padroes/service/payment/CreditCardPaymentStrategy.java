package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.domain.Order;

public class CreditCardPaymentStrategy implements  PaymentStrategy{
    @Override
    public void pay(Order order) {
        System.out.println("Do credit card payment!");
    }
}
