/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Metages
 */
@Entity
public class Movies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
    private String title;
   // @NotBlank
    private String description;
    //  @Min(1)
    private int numberInStock;
   // @Min(1)
    private double rentalPrice;
   // @Min(1)
    private double salePrice;
    @Temporal(TemporalType.DATE)
    private Date releaseYear;
    private String genere;
   
    @Transient
    private boolean available;
    @Transient
    private MultipartFile image;
   // @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
//    @Valid
   // private List<Rental> rental;
    //@ManyToMany
//    @Valid
  //  private List<Actors> actors;
  //  @Valid
   @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
   Payment payment;
    public Movies() {
    }

    public Payment getPayment() {
        return payment;
    }
//
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
   

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

//    public List<Rental> getRental() {
//        return rental;
//    }
//
//    public void setRental(List<Rental> rental) {
//        this.rental = rental;
//    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Actors> getActors() {
//        return actors;
//    }
//
//    public void setActors(List<Actors> actors) {
//        this.actors = actors;
//    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    
    
}
