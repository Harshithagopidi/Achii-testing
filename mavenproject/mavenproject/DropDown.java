package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
        WebElement dropDown= driver.findElement(By.id("how-select"));
        Select sc= new Select(dropDown);
        sc.selectByVisibleText("YouTube");
        sc.selectByIndex(2);
        sc.selectByValue("Word of Mouth/Referral");
        
        

	}

}
