/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.Idao;

import onlinevideostore.domain.Payment;

/**
 *
 * @author Boss
 */
public interface IPaymentDao {
    public void savePayment(Payment payment);
}
