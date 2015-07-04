/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.service;

import java.util.List;
import onlinevideostore.Idao.ICustomerDao;
import onlinevideostore.Iservice.ICustomer;
import onlinevideostore.dao.CustomerDao;
import onlinevideostore.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rediet Girma
 */

@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CustomerService implements ICustomer{
   
    
    private ICustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerService() {
    }

 

//    public void setCustomerDao(CustomerDao customerDao) {
//        this.customerDao = customerDao;
//    }

     
    @Override
    public List<Customer> getAll() {
 
     return customerDao.getAll();
    }

    @Override
    public void addCustomer(Customer customer) {
          customerDao.addCustomer(customer);
     }

    @Override
    public Customer getCustomer(int id) {
     
        return customerDao.getCustomer(id);
    }

    @Override
    public void updateCustomer(int memberId, Customer customer) {
         customerDao.updateCustomer(memberId, customer);
    }

    @Override
    public void deleteCustomer(int memberId) {
         customerDao.deleteCustomer(memberId);
    }
    
    
     
    
}
