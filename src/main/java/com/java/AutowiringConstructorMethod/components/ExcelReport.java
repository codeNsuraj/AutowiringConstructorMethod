package com.java.AutowiringConstructorMethod.components;

import org.springframework.stereotype.Component;

@Component("ExcelReport")
public class ExcelReport implements IReport{

	@Override
	public void generateReport() {
		
		System.out.println("ExcelReport");
		
	}

}