package br.edu.ifpb.padroes.strategy.copy;

import br.edu.ifpb.padroes.domain.Payment;
import br.edu.ifpb.padroes.domain.PaymentType;

public interface PaymentInterface {
	Payment typePayment(PaymentType type);
}
