package com.richie.web;
import org.springframework.boot.CommandLineRunner;

public class Mybean implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception { 
		
		System.out.println("------------------------->this is my bean !! <-------------------------");
		
	}

}
