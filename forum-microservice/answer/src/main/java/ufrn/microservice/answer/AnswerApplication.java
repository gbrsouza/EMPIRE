package ufrn.microservice.answer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ufrn.microservice.core.property.JwtConfiguration;

@SpringBootApplication
@EntityScan({"ufrn.microservice.core.model"})
@EnableJpaRepositories({"ufrn.microservice.core.repository"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("ufrn.microservice")
public class AnswerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnswerApplication.class, args);
	}

}
