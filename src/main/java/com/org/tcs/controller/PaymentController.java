package com.org.tcs.controller;

import com.org.tcs.model.Payment;
import com.org.tcs.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/amazon")
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    //CRUD

    @PostMapping("/create")
    public void createPayment(@RequestBody Payment payment) {
        paymentService.createPayment(payment);
    }

    @PatchMapping("/updateNameById/{paymentId}/{paymentName}")
    public String updateNameBasedOnId(@PathVariable int paymentId, @PathVariable String paymentName) {
        String s1 = paymentService.updateNameBasedOnId(paymentId, paymentName);
        return s1;
    }

    @GetMapping("/getById/{paymentId}")
    public Payment getById(@PathVariable int paymentId) {
        Payment opt = paymentService.getById(paymentId);
        return opt;

    }
    @GetMapping("/getAll")
    public List<Payment> getAll() {
        List<Payment> opt = paymentService.getAll();
        return opt;

    }
    @PutMapping("/update")
    public void updatePayment(@RequestBody Payment payment){
        paymentService.updatePayment(payment);
    }
    @DeleteMapping("/deleteById/{paymentId}")
    public String deleteById(@PathVariable int paymentId){
        String s=paymentService.deleteById(paymentId);
        return s;
    }


}
