package com.framework.cucumber.helper;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.framework.config.GlobalProperties;
import com.framework.utils.StringUtils;

import cucumber.runtime.ClassFinder;
import cucumber.runtime.Runtime;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;

public class TestNGRunnerHelper {

	public static void runTestNG(String feature, String tag) {
		List<String> CucumberOpts = new ArrayList<String>();

		if (tag.isEmpty()) {
			CucumberOpts.add("-p");
			CucumberOpts.add("json:target/" + GlobalProperties.SuiteName + "/cucumber-report_"
					+ StringUtils.testDataModification("test") + ".json");
			CucumberOpts.add("--glue");
			CucumberOpts.add("cucumber.example.stepdefinitions");
			CucumberOpts.add(feature);
		} else {
			CucumberOpts.add("-p");
			CucumberOpts.add("json:target/" + GlobalProperties.SuiteName + "/cucumber-report_"
					+ StringUtils.testDataModification("test") + ".json");
			CucumberOpts.add("--glue");
			CucumberOpts.add("cucumber.example.stepdefinitions");
			CucumberOpts.add(feature);
			CucumberOpts.add("--tags");
			CucumberOpts.add(tag);
		}
		String[] argv = (String[]) CucumberOpts.toArray(new String[CucumberOpts.size()]);
		RuntimeOptions runtimeOptions = new RuntimeOptions(new ArrayList<String>(asList(argv)));
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		ResourceLoader resourceLoader = new MultiLoader(classLoader);
		ClassFinder classFinder = new ResourceLoaderClassFinder(resourceLoader, classLoader);
		Runtime runtime = new Runtime(resourceLoader, classFinder, classLoader, runtimeOptions);
		try {
			runtime.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
