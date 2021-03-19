package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.DatabaseLogHandler;
import br.edu.ifpb.padroes.service.log.FileLogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;


/***
 *
 * Padrõo Observer: OrderService é o publisher
 *
 * Padrão State
 *
 */
public class OrderManager {

    private Order order;

    private OrderState state;

    private PaymentService paymentService = new PaymentService();

    // Padrão Bridge
    private LogService logService = new LogService(new FileLogHandler());

    public OrderManager(Order order) {
        this.order = order;
    }

    public void payOrder(PaymentStrategy paymentStrategy) {
        order.setStatus(Order.OrderStatus.IN_PROGRESS);
        try {
            paymentService.doPayment(paymentStrategy, order);
            order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
            changeState(new OrderFinishedState());
            logService.info("payment finished");
        } catch (Exception e) {
            logService.error("payment refused");
            order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
            changeState(new OrderRefusedState());
        }
    }

    public void cancelOrder() {
        order.setStatus(Order.OrderStatus.CANCELED);
        changeState(new OrderCanceledState());
        logService.debug(String.format("order %d canceled", order.getId()));
    }

    private void changeState(OrderState state) {
        this.state = state;
        state.notifyStatusChange(order);
    }

}
