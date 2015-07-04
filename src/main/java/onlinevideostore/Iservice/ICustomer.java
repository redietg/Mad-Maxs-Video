/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.Iservice;

import java.util.List;
import onlinevideostore.domain.Customer;

/**
 *
 * @author Rediet Girma
 */
public interface ICustomer {
   
       public abstract List<Customer> getAll();

	public abstract void addCustomer(Customer customer);

	public abstract Customer getCustomer(int id);

	public abstract void updateCustomer(int memberId, Customer customer);

	public abstract void deleteCustomer(int memberId);
     
}
