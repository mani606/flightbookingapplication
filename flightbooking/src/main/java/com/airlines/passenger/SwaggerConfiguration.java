package com.airlines.passenger;



import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket bookingApi() {
		return new Docket(DocumentationType.SWAGGER_2)          
				.select()                                       
				.apis(RequestHandlerSelectors.basePackage("com.spring.passenger"))
				.paths(PathSelectors.ant("/**"))                     
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Flight Booking REST API", 
				"Flight Booking REST API Documentatoion", 
				"API TOS", 
				"Terms of service", 
				new Contact("", "", ""), 
				"License of API", "API license URL");
	}
}


