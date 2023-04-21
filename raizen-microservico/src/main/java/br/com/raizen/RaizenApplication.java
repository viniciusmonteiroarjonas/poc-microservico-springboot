package br.com.raizen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RaizenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaizenApplication.class, args);
	}

}
