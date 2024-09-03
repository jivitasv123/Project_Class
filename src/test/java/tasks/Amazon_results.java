package tasks;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_results {

static WebDriver driver;
	
	public static void launch() {
		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	}
	public static void url() {
		driver.get("https://www.amazon.in/");
}
	public static void search() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobiles");
//		driver.findElements(By.xpath("//input[@type='submit']"));
		}
	public static void suggestions() {
	 WebElement sugg = driver.findElement(By.xpath("//div[@class='nav-issFlyout nav-flyout']/div/div/div/div[6]"));
	
		 String s= sugg.getText();
		 System.out.println(s);
			
	}
	
	public static void main(String[] args) {
		launch();
		url();
		search();
		suggestions();
	}
}