package Rutuja.QT_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mini_project_Trivago {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.trivago.in/");
	d.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Mumbai");
	d.findElement(By.xpath("//span[@data-testid='checkin-calendar-subline']")).click();
//	d.findElement(By.id("calendar-checkin-date")).click();
	d.findElement(By.xpath("(//span[text()='14'])[1]")).click();
	
	d.findElement(By.xpath("//span[@data-testid=\"checkout-calendar-subline\"]")).click();
	d.findElement(By.xpath("(//span[text()='16'])[1]")).click();
//	d.findElement(By.xpath("//span[@data-testid=\"undefined-label\"]")).click();
	d.findElement(By.xpath("//span[@class=\"w-full text-center font-bold\"]")).click();
	Thread.sleep(10000);
	WebElement ele=d.findElement(By.id("sorting-selector"));
	Select s = new Select(ele);
	s.selectByVisibleText("Rating only");
	
	
}

}
