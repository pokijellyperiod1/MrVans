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
public class MrVanApplication implements CommandLineRunner {

	@Autowired
	private MonRepository monRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MrVanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Ten: " + monRepository.findOneByName("name2").toString());
//		System.out.println("Gia: " + monRepository.findOneByPrice(123).toS	tring());
//		
//		List<MonEntity> lists=  new ArrayList<>();
//		String day = "tuesday";
//		lists = monRepository.findAllByDay(day);
//		System.out.println("Danh sach sap xep theo " + day );
//		for (MonEntity monEntity : lists) {
//			System.out.print(monEntity.getName() + "\t");
//		}
		
	}
		
}	
