package com.example.basic.MicroServices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld 
{

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
}
