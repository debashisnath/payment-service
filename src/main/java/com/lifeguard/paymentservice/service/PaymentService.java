package com.lifeguard.paymentservice.service;

import com.lifeguard.paymentservice.model.PaymentCallback;
import com.lifeguard.paymentservice.model.PaymentDetail;

public interface PaymentService {

	public PaymentDetail proceedPayment(PaymentDetail paymentDetail) ;
	public String payuCallback(PaymentCallback paymentResponse) ;
}
