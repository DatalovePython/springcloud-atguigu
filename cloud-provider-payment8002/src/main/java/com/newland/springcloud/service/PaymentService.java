package com.newland.springcloud.service;

import com.newland.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author luzc
 * @date 2020/12/5 13:35
 * @desc
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
