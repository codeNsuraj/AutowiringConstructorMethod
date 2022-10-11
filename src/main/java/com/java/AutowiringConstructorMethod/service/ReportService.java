package com.java.AutowiringConstructorMethod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.AutowiringConstructorMethod.components.IReport;

@Service
public class ReportService {

	private IReport iReport;

	public void downloadReport() {
		if (iReport != null) {
			iReport.generateReport();
			return;
		}
		System.out.println("iReport is Null");
	}

	@Autowired
	public ReportService(@Qualifier("ExcelReport") IReport iReport) {
		this.iReport = iReport;
	}
}