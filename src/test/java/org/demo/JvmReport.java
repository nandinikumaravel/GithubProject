package org.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JvmReport {
	
	public static void generateJvmReport(String name) {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\Reports\\JVM");
		Configuration c = new Configuration(f, "Facebook");
		c.addClassifications("OS", "Windows");
		c.addClassifications("tool", "Selenium");
		c.addClassifications("language", "Java");
		
		List<String> l = new ArrayList<String>();
		l.add(name);

		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}

}
