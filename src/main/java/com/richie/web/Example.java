package com.richie.web;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.richie.web.demo.Demo;

/**
 * Created by 28395 on 2016/6/20.
 */
@RestController
//@EnableAutoConfiguration
@SpringBootApplication
@RequestMapping("/first")
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello world!";
	}
	
	@RequestMapping("/test")
	String test() {
		return "this is test !";
	}
	
	
	 @RequestMapping("/getFastJson")   
	 public String getFastJson(){  
	  
	    Demo demo = new Demo();  
	  
	    demo.setId("112");  
	  
	    demo.setName("Angel2");  
	  
	    return JSONObject.toJSONString(demo);  
	  
	 }  
	 
	 @RequestMapping("/getJsonDemo")   
	 public Demo getDemo(){  
	  
	    Demo demo = new Demo();  
	  
	    demo.setId("1122");  
	  
	    demo.setName("Angel2");  
	  
	    return demo;  
	  
	 }  
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}}
