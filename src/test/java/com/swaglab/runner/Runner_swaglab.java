package com.swaglab.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ReusableMethods.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\com\\swaglab\\feature\\swaglab.feature",
glue = "com.swaglab.stepdefinition", 
plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Runner_swaglab extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {
		driver=	browserLaunch("chrome");
	}

	@AfterClass
	public static void close() {
		driver.close();
	}
}
