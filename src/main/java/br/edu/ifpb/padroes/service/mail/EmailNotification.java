package br.edu.ifpb.padroes.service.mail;

import br.edu.ifpb.padroes.service.order.OrderStateSubscriber;


/***
 * Padrão Observer: EmailNotification é um subscriber do Publisher OrderService
 */

/**
 * Padrão Strategy
 */
public interface EmailNotification extends OrderStateSubscriber {

    void sendMailNotification(String message, String email);

}
