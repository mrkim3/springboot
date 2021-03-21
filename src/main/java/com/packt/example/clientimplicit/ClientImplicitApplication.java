package com.packt.example.clientimplicit;

import com.packt.example.clientimplicit.vo.DemoVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashMap;

@Controller
@SpringBootApplication
@EnableSwagger2
@RequestMapping("/")
public class ClientImplicitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientImplicitApplication.class, args);

		System.out.println("Spring Boot test Started.");
	}

}
