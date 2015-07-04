/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinevideo.aop;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;


/**
 *
 * @author Rediet Girma
 */
public class MailDispatcher implements IMailDispatcher{

    private MailSender mailSender;

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }
    
    @Override
    public void sendMail(String from, String to, String subject, String msg) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(msg);
        mailSender.send(message);
     }
    
    
}
