package br.edu.ifpb.padroes.service.mail;

import br.edu.ifpb.padroes.domain.Order;

/***
 * Padrão observer: implementa subscriber para publisher OrderService
 */
public class UserEmailNotification implements  EmailNotification {

    @Override
    public void sendMailNotification(String message, String email) {
        System.out.println(String.format("Send user message %s to email %s", message, email));
    }

    @Override
    public void orderCreated(Order order) {
        sendMailNotification("Order "+order.getId()+ "was created", order.getCustomer().getEmail());
    }

}
