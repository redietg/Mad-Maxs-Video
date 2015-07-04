/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.validation.Valid;
import onlinevideostore.Iservice.ICustomer;
import onlinevideostore.domain.Customer;
import onlinevideostore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
 
/**
 *
 * @author Rediet Girma
 */
@Controller
@SessionAttributes(value={"username"})
public class CustomerController {
   @Autowired
    ICustomer customerService;
 
    
   @RequestMapping(value={"/","/index"})
	public String inputindex(Model model) {
            model.addAttribute("username");
  		return "index";
	}
   
   
    @RequestMapping(value="/addCustomer", method = RequestMethod.GET)
	public String inputCustomer(@ModelAttribute Customer customer) {
  		return "customerRegistration";
	}
   
    
        @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String customerInfor(@Valid Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "customerRegistration";
		} else {
			String md5password = DigestUtils.md5DigestAsHex(customer
					.getPassword().getBytes());
			customer.setPassword(md5password);
			customer.setRole("ROLE_USER");
                        customerService.addCustomer(customer);
 			//notification(customer);
			return "login";
		}
	}
       
       @RequestMapping(value="/customer/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		model.addAttribute("customer", customerService.getCustomer(id));
		return "manageCustomer";
	}
        

        @RequestMapping(value="/customers", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("customers", customerService.getAll());
		return "customerList";
	}
        
        
        
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.POST)
	public String updateCustomer(Customer customer, @PathVariable int id) {
           
		customerService.updateCustomer(id, customer);
		return "redirect:/customers";
	       
        }
         

	@RequestMapping(value = "/customer/delete", method=RequestMethod.POST)
	public String deleteCustomer(@RequestParam("memberId") int memeberId) {
		//Customer customer = customerService.getCustomer(id);
 		customerService.deleteCustomer(memeberId); 
		return "redirect:/cusDelete";
	}
        
        
        @RequestMapping(value="/cusDelete", method = RequestMethod.GET)
        public String deleteCus(Model model){
            
            List<Customer> customers = customerService.getAll();
            model.addAttribute("customer",customers);
            return "redirect:/customers";
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        @ExceptionHandler(value=NoSuchResourceException.class)
//	public ModelAndView handle(Exception e) {
//		ModelAndView mv = new ModelAndView();
//		mv.getModel().put("e", e);
//		mv.setViewName("404");
//		return mv;
//	}
//        
        
    
    
}
