package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@SpringBootApplication
public class BootProjMvc12I18nEnabelingApplication {
	
	
	//to activate i18n
	@Bean(name="localeResolver")
	public SessionLocaleResolver createSLResolver() {
		System.out.println("BootProjMvc12I18nEnabelingApplication.createSLResolver()");
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en", "US"));
		return resolver;
		
	}
	
	//to activate locale change interceptor
	@Bean
	public LocaleChangeInterceptor createLCInterceptor() {
		System.out.println("BootProjMvc12I18nEnabelingApplication.createLCInterceptor()");
		 LocaleChangeInterceptor interceptor= new  LocaleChangeInterceptor();
		 interceptor.setParamName("lang");//default is locale
		 return interceptor;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BootProjMvc12I18nEnabelingApplication.class, args);
		System.out.println("BootProjMvc12I18nEnabelingApplication.main()");
		
		
	}

}
