package com.java.AutowiringConstructorMethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.AutowiringConstructorMethod.service.ReportService;

@SpringBootApplication
public class AutowiringConstructorMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AutowiringConstructorMethodApplication.class, args);
		ReportService reportService = configurableApplicationContext.getBean(ReportService.class);
		reportService.downloadReport();
	
	}

}
