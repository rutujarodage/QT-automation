package Rutuja.QT_automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploading {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Widgets");
		driver.findElement(By.id("image_file")).sendKeys("C:\\Users\\rutuja.rodage\\Pictures.png");
		driver.findElement(By.xpath("//input[@value='Upload']")).click();
		
		
	}
	
	
}
