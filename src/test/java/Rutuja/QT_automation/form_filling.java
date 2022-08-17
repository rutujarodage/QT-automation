package Rutuja.QT_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class form_filling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("http://www.uitestpractice.com/Students/Form");
        d.findElement(By.id("firstname")).sendKeys("Rutuja");
        d.findElement(By.id("lastname")).sendKeys("Rodage");
        d.findElement(By.name("optradio")).click();
        d.findElement(By.xpath("//input[@value='dance']")).click();
        Thread.sleep(3000);
        
        WebElement element=d.findElement(By.id("sel1"));
        Select select=new Select(element);
        select.selectByVisibleText("India");
        d.findElement(By.id("datepicker")).click(); 
        WebElement month = d.findElement(By.className("ui-datepicker-month"));
        Select s1 = new Select(month);
        s1.selectByVisibleText("Feb");
        
        WebElement year = d.findElement(By.className("ui-datepicker-year"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("2020");
        d.findElement(By.className("ui-state-default")).click();
 
        Thread.sleep(3000);
        d.findElement(By.id("phonenumber")).sendKeys("9997897897");
        d.findElement(By.id("username")).sendKeys("Rutuja.Rodage");
        d.findElement(By.id("email")).sendKeys("abc@gmail.com");
        d.findElement(By.id("comment")).sendKeys("I am software tester");
        d.findElement(By.id("pwd")).sendKeys("123456");
        Thread.sleep(8000);
        d.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
