/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Metages
 */
@Entity
public class Actors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//     @NotEmpty
    private String gender;
//     @NotEmpty
    private String firstName;
//     @NotEmpty
    private String lastName;
    private String actorDetails;
//    @Valid
//    @ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL)
//    List<Movies> movies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Actors() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getActorDetails() {
        return actorDetails;
    }

    public void setActorDetails(String actorDetails) {
        this.actorDetails = actorDetails;
    }

//    public List<Movies> getMovie() {
//        return movies;
//    }
//
//    public void setMovies(List<Movies> movie) {
//        this.movies = movie;
//    }

    
}
