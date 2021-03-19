package br.edu.ifpb.padroes.service.mail;

import br.edu.ifpb.padroes.domain.Order;

public class AdminEmailNotification implements EmailNotification{

    private String emailAdministration = "contact@food-store.com";

    @Override
    public void sendMailNotification(String message, String email) {
        System.out.println(String.format("Send system message %s to email %s", message, email));
    }

    @Override
    public void orderCanceled(Order order) {
        sendMailNotification("Order "+order.getId()+ "was updated", emailAdministration);
    }

}
