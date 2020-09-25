package com.example.Docker.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class HelloResource {
	@RequestMapping("/")
	@ResponseBody
		public String Hello()
	{
		System.out.println("subuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
			return "welocme to springboot";
	}

	}


