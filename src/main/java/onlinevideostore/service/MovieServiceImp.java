/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.service;

import java.util.List;
import onlinevideostore.IMovieDao;


import onlinevideostore.Iservice.IMovieService;
import onlinevideostore.dao.MovieDao;
import onlinevideostore.domain.Movies;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Boss
 */

@Transactional(propagation = Propagation.REQUIRES_NEW)

public class MovieServiceImp implements IMovieService{
 
IMovieDao movieDao;

    public MovieServiceImp(MovieDao movieDao) {
        this.movieDao = movieDao;
    }


//    public MovieServiceImp() {
//    }

    public MovieServiceImp() {
    }



    @Override
    public void addMovie(Movies movie) {
       // javax.swing.JOptionPane.showMessageDialog(null, movie.getTitle());
        movieDao.addMovie(movie);
    }

    @Override
    public void deleteMovieById(long id) {
        movieDao.deleteMovieById(id);
    }

    @Override
    public List<Movies> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public List<Movies> getMovieByTitle(String title) {
         return movieDao.getMovieByTitle(title);
    }

    @Override
    public List<Movies> getMovieByReleaseDate(int year) {
      return movieDao.getMovieByReleaseDate(year);
    }

    @Override
    public List<Movies> getMovieByGener(String gener) {
        return movieDao.getMovieByGener(gener);
        
    }

  

//    public void setMovieDao(MovieDao movieDao) {
//        this.movieDao = movieDao;
//    }

    @Override
    public Movies getMovieById(long id) {
       return movieDao.getMovieById(id);
    }

   
    public void updateMovie(long id) {
		Movies movie=movieDao.getMovieById(id);
		 int numberInStock=movie.getNumberInStock()-1;
		 movie.setNumberInStock(numberInStock);
		 movieDao.addMovie(movie);
		 
		
	}

    
}
