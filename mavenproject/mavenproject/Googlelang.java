package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlelang {
	public static void main(String[] args) throws Exception {
		Googlelang abc=new Googlelang();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		abc.intialization(driver);
		abc.mylang(driver);
		abc.end(driver);
	
	}
	public void intialization(WebDriver driver) throws InterruptedException {
	   driver.get("https://www.google.co.in/");
	   Thread.sleep(3000);
	   driver.manage().window().maximize();
	 }
	public void mylang(WebDriver driver) throws Exception {
		driver.findElement(By.linkText("हिन्दी")).click();
		Thread.sleep(3000);
	}
	public void end(WebDriver driver) {
	    driver.close();
	}
	}
