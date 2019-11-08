package com.lifeguard.paymentservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lifeguard.paymentservice.model.Payment;

@Repository
public interface PaymentRepo extends CrudRepository<Payment, String> {

    Payment findByTxnId(String txnId);
}
