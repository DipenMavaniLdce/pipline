package com.mdd.pipline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PiplineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiplineApplication.class, args);
	}
	
	@RequestMapping("/")
	public String getData() {
		return "Welocme DIpen";
	}

}
	