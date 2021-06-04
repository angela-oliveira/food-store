package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.domain.Payment;
import br.edu.ifpb.padroes.domain.PaymentType;
import br.edu.ifpb.padroes.strategy.PaymentInterface;

public class PaymentService {


	public PaymentService() {

	}

	public PaymentService(PaymentInterface paymentInterface) {
		this.paymentInterface = paymentInterface;
	}

	private PaymentInterface paymentInterface;

	public Payment definePayment(PaymentType type) {
		return paymentInterface.typePayment(type);
	}

}
