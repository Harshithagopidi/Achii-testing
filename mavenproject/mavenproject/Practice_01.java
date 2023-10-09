package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_01 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("ww");
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

        driver.findElement(By.linkText("nav-link btn btn-primary")).click();
	/*	driver.findElement(By.id("inputUsername")).sendKeys("harshitha");
		driver.findElement(By.name("inputPassword")).sendKeys("reddy");*/
	}

}
