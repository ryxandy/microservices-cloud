package com.microservice.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.microservice.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Alexandre", 200.0, days);
	}
}
