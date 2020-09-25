package com.example.Docker.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
@Controller
@SpringBootApplication


@ComponentScan(basePackages = {"com.example.Docker.springboot"})
public class DockerSpringbootApplication   {

	public static void main(String[] args) {
		
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}

}
