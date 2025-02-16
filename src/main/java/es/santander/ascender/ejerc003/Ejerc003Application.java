package es.santander.ascender.ejerc003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Ejerc003Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejerc003Application.class, args);
	}

}
