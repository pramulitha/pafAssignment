package service;

import org.springframework.stereotype.Service;

import model.PaymentCallback;
import model.PaymentDetail;

public interface PaymentService {
	public PaymentDetail proceedPayment(PaymentDetail paymentDetail);
	public String payuCallback(PaymentCallback paymentResponse);
	
}
