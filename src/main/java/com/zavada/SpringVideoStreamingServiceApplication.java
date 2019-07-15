package com.zavada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.content.commons.repository.Store;
import org.springframework.content.rest.StoreRestResource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringVideoStreamingServiceApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringVideoStreamingServiceApplication.class, args);
	}

	@StoreRestResource(path = "videos")
	public interface VideoStore extends Store<String> {
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedHeaders("*").allowedOrigins("*").allowedMethods("*");
	}

}
