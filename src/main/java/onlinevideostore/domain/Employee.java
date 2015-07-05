/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author RedietGDesta
 */
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
  pirvate String firstname; 
private String lastname; 
private String address; 


 public Employee(){}

   
 public void setFirstName(String firstname){
       this.firstname=firstname;
}
 public String getFirstName(){return firstname;}
   


     public void setLastName(String lastname){
       this.firstname=firstname;
}
 public String getLastName(){return lastname;}
   

    
}
