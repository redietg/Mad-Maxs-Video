/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.dao;

import java.util.List;
import onlinevideostore.Idao.ICustomerDao;
import onlinevideostore.controller.NoSuchResourceException;
import onlinevideostore.domain.Customer;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rediet Girma
 */
@Transactional(propagation = Propagation.MANDATORY)
public class CustomerDao implements ICustomerDao{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory= sessionFactory;
    }

    public CustomerDao() {
    }

   
    @Override
    public List<Customer> getAll() {

         List<Customer> customers = sessionFactory.getCurrentSession().createQuery("from Customer").list();
   
        return customers;
     }

    @Override
    public void addCustomer(Customer customer) {
        sessionFactory.getCurrentSession().persist(customer);
    }

    @Override
    public Customer getCustomer(int id) {

      return (Customer)sessionFactory.getCurrentSession().get(Customer.class, id);
    }

    @Override
    public void updateCustomer(int memberId, Customer customer) {
             sessionFactory.getCurrentSession().update(customer);
     }

    @Override
    public void deleteCustomer(int memberId) {
        
//        Customer removed = getCustomer(memberId);
//		if (removed == null) {
//			throw new NoSuchResourceException("Customer", memberId);
//		}
        Customer delete = getCustomer(memberId);
        javax.swing.JOptionPane.showMessageDialog(null, memberId);
        sessionFactory.getCurrentSession().delete(delete);
    }

}
