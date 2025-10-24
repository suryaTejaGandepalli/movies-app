package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Controller
@ComponentScan("controller,Dao")
public class MyConfig {

		@Bean
		EntityManager manager() {
			return Persistence.createEntityManagerFactory("dev").createEntityManager();
		}
}
