package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.used.Greet;

/*
 * SpringBoot起動クラス
 */

@SpringBootApplication
public class DiSamleApplication {
	/*
	 * SpringBoot起動クラス
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiSamleApplication.class, args)
		.getBean(DiSamleApplication.class).execute();
	}
	
	@Autowired
	private Greet g;
	
	private void execute() {
		String msg = g. greeting();
		System.out.println(msg);
	}

}
