package onlinevideostore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import onlinevideostore.Iservice.IMovieService;
import onlinevideostore.Iservice.IPaymentService;
import onlinevideostore.domain.Movies;
import onlinevideostore.domain.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
	
	@Autowired
	IPaymentService paymentService;
	@Autowired
	IMovieService service;
	
	
	Movies movie;
	Payment  p;
	double total;

@RequestMapping(value={"/paymentForm"}, method=RequestMethod.GET)

public String getPaymentForm(@RequestParam("id") long movieId,@RequestParam("price") double price,@ModelAttribute("paymentinfo") Payment payment,Model model)
//public String getReservationForm(@ModelAttribute("reservation") Reservation reservation)
    {
	 System.out.println(price);
	 total=price;
	 movie=service.getMovieById(movieId);
	 p=new Payment(movie);
	 p.setMovie(movie);
         p.setTotal(total);
	 
	model.addAttribute("paymentinfo",p);
	  
	  
	  return "paymentForm";
    }


@RequestMapping(value={"/savePayment"}, method=RequestMethod.POST)

public String saveReservation(@ModelAttribute("paymentinfo") Payment payment)
    {
	
	
//	if(result.hasErrors()){ System.out.println("invalid..."); return "paymentForm";
//		
//	}
	  //System.out.println("valid...");
	  
	  payment.setTotal(total);
	  
	  return "paymentForm";
    }

@RequestMapping(value={"/thankyoupage"}, method=RequestMethod.POST)

public String thankyouReservation( @Valid @ModelAttribute("paymentinfo") Payment payment, BindingResult result)
    {
	
	if(result.hasErrors()){ 
            //System.out.println("invalid...");

            return "paymentForm";
		
	}
//	  System.out.println("Thank you valid...");
	  payment.setMovie(movie);
	  service.updateMovie(movie.getId());
	 paymentService.savePayment(payment);
	  
	  return "thankyoupage";
    }	






}
