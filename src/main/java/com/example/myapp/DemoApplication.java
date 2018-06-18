package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "To-Do-List:";
		return "1.Complete Tech Exercise";
		return "2. Work on research paper";
		return "3. Pass App project";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
