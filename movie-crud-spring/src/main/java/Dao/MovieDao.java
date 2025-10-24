package Dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entity.Movie;
import jakarta.persistence.EntityManager;

@Component
public class MovieDao {
		
	
		@Autowired
		EntityManager manager;
		
		public void save(Movie movie) {
			manager.getTransaction().begin();
			manager.persist(movie);
			manager.getTransaction().commit();
		}
		
		public List<Movie> fetchAll(){
			return manager.createNativeQuery("select * from movie",Movie.class).getResultList();
		}
}
