package com.framework.reports;

import java.io.File;
import java.io.FilenameFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.config.GlobalProperties;
import com.framework.config.PropertiesRepository;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReports {
	static WebDriver driver;

	public static void generateCucumberReport(String suiteName) {
		String filePath = System.getProperty("user.dir") + PropertiesRepository.getString("jsonfile.path")
				+ GlobalProperties.SuiteName;

		List<String> jsonFiles = new ArrayList<>();

		File[] fileList = getFileList(filePath);

		for (File file : fileList) {
			jsonFiles.add(file.getPath());
		}

		DateFormat dateFormat = new SimpleDateFormat("YYYY_MM_dd");
		Calendar cal = Calendar.getInstance();

		String reportsPath = System.getProperty("user.dir") + PropertiesRepository.getString("reports.path");

		String outputDirPath = reportsPath + "/"+ GlobalProperties.SuiteName+"_" + dateFormat.format(cal.getTime());

		File reportOutputDirectory = new File(outputDirPath);
		String buildNumber = PropertiesRepository.getString("report.project.buildnumber");
		String projectName = PropertiesRepository.getString("report.project.name");
		boolean runWithJenkins = false;
		boolean parallelTesting = false;
		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		// optional configuration
		configuration.setParallelTesting(parallelTesting);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);

		// Additional meta data presented on main page
		configuration.addClassifications("Browser", capabilities.getBrowserName().toUpperCase());
		configuration.addClassifications("Browser Version", capabilities.getVersion());
		configuration.addClassifications("Java Version", System.getProperty("java.version").toUpperCase());
		configuration.addClassifications("Platform", System.getProperty("os.name").toUpperCase());
		configuration.addClassifications("Host Name", System.getenv("COMPUTERNAME").toUpperCase());

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}

	private static File[] getFileList(String dirPath) {
		File dir = new File(dirPath);

		File[] fileList = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".json");
			}
		});
		return fileList;
	}

	public static void setDriver(WebDriver webDriver) {
		driver = webDriver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
