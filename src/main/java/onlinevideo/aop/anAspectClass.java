/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinevideo.aop;

import onlinevideostore.domain.Customer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author Rediet Girma
 */
@Aspect
public class anAspectClass {
    
    private MailDispatcher mailDispatcher;

    public void setMailDispatcher(MailDispatcher mailDispatcher) {
        this.mailDispatcher = mailDispatcher;
    }
    
    @After("execution(* onlinevideostore.dao.*.addCustomer(..))")
    public void SendComfirmationEmail(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Customer customer = (Customer)args[0];
        String e_mail = customer.getEmail();
        String Fname = customer.getFirstname();
        String confirmationEmail = "Dear "+ Fname+"\n"+ "Thank you for signing up!"+"\n"+"This is a mail from the team of Online Video Rental";
        mailDispatcher.sendMail("MyVideoRental", e_mail, "Sign up comfirmation", confirmationEmail);
    }
    
    
    
}
