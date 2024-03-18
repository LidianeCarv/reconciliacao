package contas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("contas.model")
@EnableJpaRepositories(basePackages = "contas.model")
public class ReconciliacaoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ReconciliacaoApplication.class, args);
	}

}
