package Rutuja.QT_automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mini_project2IRCTC {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("HYDERABAD DECAN - HYB");
		WebElement ele = d.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		ele.sendKeys("PUNE JN - PUNE");
		d.findElement(By.xpath("//input[@class=\"ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]")).click();
		d.findElement(By.xpath("//a[text()='12']")).click();
		d.findElement(By.xpath("//span[@class=\"ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted\"]")).click();
		d.findElement(By.xpath("//span[text()='Sleeper (SL)']")).click();
		d.findElement(By.xpath("//label[@for='concessionBooking']")).click();
		d.findElement(By.xpath("//span[text()='OK']")).click();
		d.findElement(By.xpath("//button[text()='Search']")).click();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\rutuja.rodage\\Pictures\\codeshot\\ptt.png");
		FileHandler.copy(src, dest);
	//	Thread.sleep(15000);
	//	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
	}

}
