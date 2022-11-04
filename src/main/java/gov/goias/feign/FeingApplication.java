package gov.goias.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingApplication.class, args);
	}

}
