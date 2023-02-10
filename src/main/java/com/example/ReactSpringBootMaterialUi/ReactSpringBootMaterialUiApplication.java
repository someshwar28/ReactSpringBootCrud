package com.example.ReactSpringBootMaterialUi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "EmployeeMgmt"))
@SpringBootApplication
public class ReactSpringBootMaterialUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringBootMaterialUiApplication.class, args);
	}

}
