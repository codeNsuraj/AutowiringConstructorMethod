package com.java.AutowiringConstructorMethod.components;

import org.springframework.stereotype.Component;

@Component("PdfReport")
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		
		System.out.println("PdfReport");
		
	}
	
	

}