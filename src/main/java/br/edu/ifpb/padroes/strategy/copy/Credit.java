package br.edu.ifpb.padroes.strategy.copy;

import br.edu.ifpb.padroes.domain.Payment;
import br.edu.ifpb.padroes.domain.PaymentType;

public class Credit implements PaymentInterface{


	@Override
	public Payment typePayment(PaymentType type) {
		// TODO Auto-generated method stub
		System.out.println("Do credit card payment!");
		return null;
	}
}
