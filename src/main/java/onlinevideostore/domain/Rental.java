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
 * @author Metages
 */
@Entity
public class Rental implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @ManyToOne
//    @Valid
//    Movies movie;
   // private Customer customer;
    @NotEmpty
    private Date timeDue;
    @NotEmpty
    private Date timeReturned;

     public Rental() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Movies getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movies movie) {
//        this.movie = movie;
//    }

    public Date getTimeDue() {
        return timeDue;
    }

    public void setTimeDue(Date timeDue) {
        this.timeDue = timeDue;
    }

    public Date getTimeReturned() {
        return timeReturned;
    }

    public void setTimeReturned(Date timeReturned) {
        this.timeReturned = timeReturned;
    }

   

    
    
}
