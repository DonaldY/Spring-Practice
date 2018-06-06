package com.donaldy.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class Lesson1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson1Application.class, args);
	}
	
	@RequestMapping("/rest")
	@ResponseBody
	public Map<String, Object>  rest() {
		Map<String, Object> data = new HashMap<>();
		
		data.put("1", "A");
		data.put("2", "AA");
		
		return data;
	}
}
