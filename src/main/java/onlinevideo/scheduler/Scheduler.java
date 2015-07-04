/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideo.scheduler;

import java.util.List;
import onlinevideostore.Iservice.IMovieService;
import onlinevideostore.domain.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 *
 * @author Rediet Girma
 */
public class Scheduler {
     @Autowired
    IMovieService movieService;
    @Scheduled(cron="0/50 * * * * *")
    public void stockChecker()
    {
      List<Movies> movies=  movieService.getAllMovies();
      for(Movies m:movies)
      {
          if(m.getNumberInStock()==0)
          {
              javax.swing.JOptionPane.showMessageDialog(null, m.getTitle() + " is out of Stock ");
          }
             
      }
          

    }
}
