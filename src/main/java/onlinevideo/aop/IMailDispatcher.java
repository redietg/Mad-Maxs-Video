/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinevideo.aop;

import org.springframework.mail.MailSender;

/**
 *
 * @author Rediet Girma
 */
public interface IMailDispatcher {
    public void setMailSender(MailSender mailSender);
    public void sendMail(String from, String to, String subject, String msg);
    
}
