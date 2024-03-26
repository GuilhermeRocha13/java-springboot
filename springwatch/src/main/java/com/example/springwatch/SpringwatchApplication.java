package com.example.springwatch;

import com.example.springwatch.services.ApiConsum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springwatch.model.*;
import com.example.springwatch.services.*;

@SpringBootApplication
public class SpringwatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringwatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var apiconsum = new ApiConsum();
		var json = apiconsum.dataGet("https://www.omdbapi.com/?t=transformers&apikey=9e27a9fb");

		System.out.println(json);
		dataConvert converter = new dataConvert();
		showData data = converter.dataGet(json, showData.class);

		System.out.println(data);
	}
}
