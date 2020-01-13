package com.example.basic.MicroServices.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld 
{
	@Autowired
	private MessageSource msg;

@RequestMapping(method=RequestMethod.GET,path="/hello-world")
public String helloWorld()
{
return "Hello Worlds";	
}

@GetMapping(path="hello-world-get")
public String helloWorldget()
{
return "Hello Worlds";	
}
@GetMapping(path="hello-world-bean")
public HelloWorldBean helloWorldBean()
{
return  new HelloWorldBean("hello beans");	
}

@GetMapping(path="hello-international")
public String helloInternationally(@RequestHeader (name="Accept-Language",required = false)Locale locale)
{
return msg.getMessage("good.morning.message", null,locale);	
}
}
