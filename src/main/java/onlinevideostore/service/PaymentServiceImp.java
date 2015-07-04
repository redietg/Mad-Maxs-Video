/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.service;

import onlinevideostore.Idao.IPaymentDao;
import onlinevideostore.Iservice.IPaymentService;
import onlinevideostore.domain.Payment;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Boss
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class PaymentServiceImp implements IPaymentService {
IPaymentDao paymentDao;
    @Override
    public void savePayment(Payment payment) {
        paymentDao.savePayment(payment);
    }

    public PaymentServiceImp(IPaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }
    
}
