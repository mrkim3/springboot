package com.packt.example.clientimplicit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@SpringBootApplication
@EnableSwagger2
@RequestMapping("/test")
public class ClientImplicitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientImplicitApplication.class, args);

		System.out.println("Spring Boot test Started.");
	}

	@GetMapping("/")
	public String client(){
		return "client";
	}

	@GetMapping("callback")
	public String callback(){
		return "callback_page";
	}


}
