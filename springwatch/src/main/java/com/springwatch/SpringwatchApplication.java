package com.example.springwatch;

import io.github.cdimascio.dotenv.Dotenv;
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

		Dotenv dotenv = Dotenv.load();
		String apiKey = dotenv.get("API_KEY");

		var apiconsum = new ApiConsum();
		var json = apiconsum.dataGet("https://www.omdbapi.com/?t=transformers&apikey=" + apiKey);

		System.out.println(json);
		dataConvert converter = new dataConvert();
		showData data = converter.dataGet(json, showData.class);

		System.out.println(data);
	}
}
