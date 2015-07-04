/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Null;
import onlinevideostore.Iservice.IMovieService;
import onlinevideostore.domain.Movies;
import onlinevideostore.service.MovieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Boss
 */
@Controller
public class MovieController {
    @Autowired
    IMovieService movieService;
    
    
    
    private String saveDirectory = "c:/test/";
	//ServiceImplementation service=new ServiceImplementation();
	@RequestMapping(value="/getMovie")
	public String getAllMovies( @ModelAttribute("movies") Movies movies,Model model)
	{
           List<Movies> listOfMovies=movieService.getAllMovies();
           model.addAttribute("listOfMovies",listOfMovies);
		return "movieForRent";
		
	}
        
        @RequestMapping(value="/getMovie", method =RequestMethod.POST)
	public String getMoviesByTitle( @ModelAttribute("movies") Movies movies,Model model)
	{
           List<Movies> listOfMovies=movieService.getMovieByTitle(movies.getTitle());
           if(listOfMovies==null)
	
		 model.addAttribute("Notfound", "We dont have Movies on    " +movies.getTitle() );
		 
	else
            model.addAttribute("listOfMovies",listOfMovies);
		return "movieForRent";
		
	}
	
	@RequestMapping(value={"/addMovie"},method=RequestMethod.GET)
	public String addMovie(@ModelAttribute Movies movies, Model model)
	{
             model.addAttribute("movies",movies);
		return "addmovie";
			
	}
	@RequestMapping(value="/addMovie" ,method=RequestMethod.POST)
	public String addMovies(@Valid Movies movies, BindingResult result, Model model,HttpServletRequest request)
	{
            //javax.swing.JOptionPane.showMessageDialog(null, "hello");
		if(result.hasErrors())
		{
                   // javax.swing.JOptionPane.showMessageDialog(null, "hello2");
                    
 			return "addmovie";
		}
                else{
                
		MultipartFile carImage = movies.getImage();
		//String rootDirectory = request.getSession().getServletContext().getRealPath("/");
				
			if (carImage!=null && !carImage.isEmpty()) {
		       try {
		      	carImage.transferTo(new File(saveDirectory + movies.getTitle()+".png"));
		       } catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
		   }
		   }
	
		movieService.addMovie(movies);
                // javax.swing.JOptionPane.showMessageDialog(null, movies.getTitle());
		model.addAttribute("movies",movies);
 		return "movieDetail";
                }		
	}
	
        //@Scheduled(cron="0/5 * * * * *")
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteMovie(@ModelAttribute Movies movies,@RequestParam("id") long movieId, Model model)
	{
		System.out.println("delete");
		movieService.deleteMovieById(movieId);

		
		return "redirect:/deletep";
		
	}
        
        
        @RequestMapping(value="/deletep",method=RequestMethod.GET)
	public String delete( Model model)
	{
		
	List<Movies> listOfMovies=movieService.getAllMovies();
           model.addAttribute("listOfMovies",listOfMovies);
		

		return "delete";
		
	}
	
//	@InitBinder
//	  public void initBinder(WebDataBinder binder) {
////	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
////	    dateFormat.setLenient(false);
////	    binder.registerCustomEditor(Date.class,
////	        new CustomDateEditor(dateFormat, false));
//  }



    
    
    
    
}
