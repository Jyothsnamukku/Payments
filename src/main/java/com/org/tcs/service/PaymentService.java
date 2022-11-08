package com.org.tcs.service;

import com.org.tcs.model.Payment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PaymentService {
    public void createPayment( Payment payment);
    public String updateNameBasedOnId(int paymentId, String paymentName);
    public Payment getById(int paymentId);
    public void updatePayment(Payment payment);
    public String deleteById(int paymentId);
    public List<Payment> getAll();
}
