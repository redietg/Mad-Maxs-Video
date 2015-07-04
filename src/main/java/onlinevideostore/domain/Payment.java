package onlinevideostore.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import onlinevideostore.domain.Movies;
import org.hibernate.validator.constraints.NotBlank;

import org.hibernate.validator.constraints.NotEmpty;




@Entity

public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
   // @NotEmpty(message="{String.empty}")
	private String firstName;
  
	
	//@NotEmpty(message="{String.empty}")
        @NotBlank
	private String lastName;
	
	private String tel;
	
	private String email;
	
	
	 //@NotEmpty(message="{String.empty}")
        @NotBlank
	private String street;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private String zip;
	
	
	
	
	
 	@OneToOne
	Movies movie;
	
	//payment info
	private String paymentMethod ;
        @NotBlank
	private String cardNumber;
        @NotBlank
	private String expDate;
        @NotBlank
	private String ccv;
	private double total;
	
	private String userName;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Movies getMovie() {
		return movie;
	}
	public void setMovie(Movies movie) {
		this.movie = movie;
	}
	private String password;
	
	public Payment() {
		
	}
	
	public Payment(Movies movie) {
		super();
		this.movie = movie;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	
	
	
	
	
}
