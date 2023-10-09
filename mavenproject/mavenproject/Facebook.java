package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*
		 * login functionality
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harshitha");
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "18harshitha"); driver.findElement(By.name("login")).click();
		 * Thread.sleep(3000);
		 */
		// entering date of birth
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Harshitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Reddy");
		driver.findElement(By.name("reg_email__")).sendKeys("9440781391");
		driver.findElement(By.id("password_step_input")).sendKeys("harshitha18");
		WebElement Dropdown = driver.findElement(By.id("day"));
		Select sc = new Select(Dropdown);
		sc.selectByValue("18");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Oct");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1997");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		// driver.findElement(By.name("websubmit")).click();
		driver.close();

	}

}
