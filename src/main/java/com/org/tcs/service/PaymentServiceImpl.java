package com.org.tcs.service;

import com.org.tcs.model.Payment;
import com.org.tcs.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

   @Autowired
   PaymentRepo paymentRepo;
    @Override
    public void createPayment(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public String updateNameBasedOnId(int paymentId, String paymentName) {
     Payment opt= paymentRepo.findByPaymentId(paymentId);
       opt.setPaymentName(paymentName);
        paymentRepo.save(opt);
        return "succesfully";
    }

    @Override
    public Payment getById(int paymentId) {
        Payment j= paymentRepo.findByPaymentId(paymentId);
        return j;
    }

    @Override
    public void updatePayment(Payment payment) {
        paymentRepo.save(payment);

    }

    @Override
    public String deleteById(int paymentId) {
        paymentRepo.deleteById(paymentId);
        return "success";
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepo.findAll();
    }
}
