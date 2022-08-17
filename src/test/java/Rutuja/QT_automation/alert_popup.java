package Rutuja.QT_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_popup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/students/switchto");
		 driver.findElement(By.id("confirm")).click();
		 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
		
		
	}

}
