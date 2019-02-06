package org.sinares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class OmsdecesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsdecesApplication.class, args);
	}
}
