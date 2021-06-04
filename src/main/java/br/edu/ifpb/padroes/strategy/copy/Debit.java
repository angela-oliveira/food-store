package br.edu.ifpb.padroes.strategy.copy;

import br.edu.ifpb.padroes.domain.Payment;
import br.edu.ifpb.padroes.domain.PaymentType;

public class Debit  implements PaymentInterface{


	@Override
	public Payment typePayment(PaymentType type) {
		// TODO Auto-generated method stub
		System.out.println("Do debit payment!");
		return null;
	}

}
