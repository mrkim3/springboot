package com.packt.example.clientimplicit.oauth.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class ClientImplicitTest {

	public static void main(String[] args) {
		SpringApplication.run(ClientImplicitTest.class, args);
	}

	@GetMapping("/")
	public String client() {
		return "client";
	}

	@GetMapping("/callback")
	public String callback() {
		return "callback_page";
	}

	@GetMapping("/test")
	public String test(){
		return "test";
	}
}
