package com.tanky.MrVan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tanky.MrVan.Repo.MonRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.tanky.MrVan")
@EnableMongoRepositories(basePackages = "com.tanky.MrVan.Repo")
@CrossOrigin	
public class MrVanApplication {

	@Autowired	
	private MonRepository monRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MrVanApplication.class, args);
	}

}	
