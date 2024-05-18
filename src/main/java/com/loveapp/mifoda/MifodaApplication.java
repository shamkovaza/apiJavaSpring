package com.loveapp.mifoda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loveapp.mifoda.run.Location;
import com.loveapp.mifoda.run.Run;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class MifodaApplication {
	private static final Logger log = LoggerFactory.getLogger(MifodaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MifodaApplication.class, args);

	}
	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 10, Location.OUTDOUR);
			log.info("Run: " + run);
		};
	}

}
