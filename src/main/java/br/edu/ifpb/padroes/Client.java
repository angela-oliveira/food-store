package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.domain.PaymentType;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.strategy.Credit;

public class Client {
    public static void main(String[] args) {

    	PaymentService paymentService = new PaymentService(new Credit());
        Order order = new Order();
		PaymentType payment = new PaymentType("CREDIT_CARD");
        OrderManager orderManager = new OrderManager(order);
		paymentService.definePayment(payment);
		orderManager.payOrder(payment);
       // orderManager.payOrder(PaymentService.PaymentType.CREDIT_CARD);
        orderManager.cancelOrder();

    
    }
}
