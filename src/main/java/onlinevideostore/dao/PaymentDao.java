/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.dao;

import onlinevideostore.Idao.IPaymentDao;
import onlinevideostore.domain.Movies;
import onlinevideostore.domain.Payment;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Boss
 */
@Transactional(propagation = Propagation.MANDATORY)
public class PaymentDao implements IPaymentDao{
  SessionFactory sessionFactory;
    @Override
    public void savePayment(Payment payment) {
        
    
       sessionFactory.getCurrentSession().persist(payment);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    
    
}
