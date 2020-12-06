package com.newland.springcloud.service.impl;

import com.newland.springcloud.dao.PaymentDao;
import com.newland.springcloud.entities.Payment;
import com.newland.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author luzc
 * @date 2020/12/5 13:36
 * @desc
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
