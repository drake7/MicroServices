package com.example.basic.MicroServices;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulApplication.class, args);
	}

//	@Bean
//	public LocaleResolver localeResolver()
//	{
//	SessionLocaleResolver slr=new SessionLocaleResolver();
//	slr.setDefaultLocale(Locale.US);
//		
//		return slr;
//		
//	}
//	
//	@Bean 
//	public ResourceBundleMessageSource res()
//	{
//		ResourceBundleMessageSource sc=new ResourceBundleMessageSource();
//		sc.setBasename("Message From");
//		return null;
//	}
}
