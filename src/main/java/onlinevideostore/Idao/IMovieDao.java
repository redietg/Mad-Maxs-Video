/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore;

import java.util.List;
import onlinevideostore.domain.Movies;

/**
 *
 * @author Boss
 */
public interface IMovieDao {
     public void addMovie(Movies movie);
    public void deleteMovieById(long id);
    public List<Movies> getAllMovies();
    public List<Movies> getMovieByTitle(String title);
    public List<Movies> getMovieByReleaseDate(int year);
    public List<Movies> getMovieByGener(String gener);
    public Movies getMovieById(long id);
    
    
}
