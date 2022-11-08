package com.org.tcs.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Payment {
 @Id
    private int paymentId;
    private String paymentName;
    private double paymentAmount;

    public int getPaymentId(int paymentId) {
      return this.paymentId;
   }

   public void setPaymentId(int paymentId) {
      this.paymentId = paymentId;
   }

   public String getPaymentName() {
      return paymentName;
   }

   public void setPaymentName(String paymentName) {
      this.paymentName = paymentName;
   }

   public double getPaymentAmount() {
      return paymentAmount;
   }

   public void setPaymentAmount(double paymentAmount) {
      this.paymentAmount = paymentAmount;
   }
}
