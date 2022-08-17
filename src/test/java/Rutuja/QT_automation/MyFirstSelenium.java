package Rutuja.QT_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSelenium {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();  //edgedriver();
        WebDriver d=new EdgeDriver();    //EdgeDriver();
        d.manage().window().maximize();
        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        String s1=d.findElement(By.id("p3")).getText();
        System.out.println(s1);
        WebElement user = d.findElement(By.id("input1"));
        user.sendKeys("JAVA");
        WebElement pwd = d.findElement(By.id("input2"));
        pwd.sendKeys("SELENIUM");
        user.clear();
        pwd.clear();
        user.sendKeys("java");
        pwd.sendKeys("selenium");
        String str1=user.getAttribute("value");
        String str2=pwd.getAttribute("value");
        System.out.println(str1);
        System.out.println(str2);
        

        
	}

}
