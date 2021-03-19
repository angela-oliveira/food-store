package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.domain.Order;

/*** Implementação do padrão Strategy **/
public class PaymentService {

    public void doPayment(PaymentStrategy paymentStrategy, Order order) throws Exception {
        paymentStrategy.pay(order);
    }

}
