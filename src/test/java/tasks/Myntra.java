package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

static WebDriver driver;
	
	public static void launch() {
		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	}
	public static void url() {
		driver.get("https://www.myntra.com/");
}
	public static void main(String[] args) {
		launch();
		url();
	}
}

