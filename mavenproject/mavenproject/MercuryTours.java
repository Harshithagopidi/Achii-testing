package mavenproject.mavenproject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		//write script to login functionality by using dynamic values
		//for giving dynamic values we use scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String uid = sc.nextLine();
		System.out.println("enter password");
		String pwd =sc.nextLine();
		sc.close();
		//to intialize the browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		// to login 
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();  
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
