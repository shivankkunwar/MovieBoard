package xyz.APIproject.APIproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApIprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIprojectApplication.class, args);

	}
	@GetMapping("/")
	public String apiRoot(){
		return "Hello world";
	}


}
