package com.akaiteam;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import com.akaiteam.domain.UmsMember;
import com.akaiteam.repository.UmsMemberRepository;

@SpringBootApplication
public class WebStoreApplication {

	private static final Logger log = LoggerFactory.getLogger(WebStoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(WebStoreApplication.class, args);
	}
	
	
	
	@Bean
	public CommandLineRunner demo(UmsMemberRepository repository) {
		return (args) -> {
			
			UmsMember member = new UmsMember("a", null);
			
			ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
					.withMatcher("username", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
				      
			
			Example<UmsMember> example = Example.of(member, customExampleMatcher);
			 
		    Optional<UmsMember> actual = repository.findOne(example);
		    if(actual.isPresent()) {
		    	System.out.println(actual.get().toString());
		    }
		 
		};
	}
	
	

}