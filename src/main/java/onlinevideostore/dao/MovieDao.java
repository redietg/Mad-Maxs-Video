/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevideostore.dao;

import java.util.List;

import onlinevideostore.IMovieDao;
import onlinevideostore.domain.Movies;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Boss
 */
@Transactional(propagation = Propagation.MANDATORY)
public class MovieDao implements IMovieDao{

    SessionFactory sessionFactory;
    public void addMovie(Movies movie) {
       sessionFactory.getCurrentSession().persist(movie);
    }

    public MovieDao() {
    }

    @Override
    public void deleteMovieById(long id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Movies m where m.id=:id");
        query.setLong("id",id);
         Movies movies= (Movies) query.uniqueResult();
        sessionFactory.getCurrentSession().delete(movies);
    }

    @Override
    public List<Movies> getAllMovies() {

        return  sessionFactory.getCurrentSession().createQuery("from Movies").list();
    }

    @Override
    public List<Movies> getMovieByTitle(String title) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Movies m where m.title=:title");
        query.setString("title",title);
         List<Movies> movies= query.list();
    return movies;
    }

    @Override
    public List<Movies> getMovieByReleaseDate(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Movies> getMovieByGener(String gener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Movies getMovieById(long id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Movies m where m.id=:id");
        query.setLong("id",id);
         List<Movies> movies= query.list();
    return (movies.isEmpty() ? null : movies.get(0));
    }
    
    
    
}
