package Rutuja.QT_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://www.trivago.in");
    d.findElement(By.xpath("//label[text()='Hotel']")).click();
    d.findElement(By.xpath("//input[@type='search']")).sendKeys("Mumbai");
    Thread.sleep(9000);
    d.findElement(By.xpath("//button[@data-testid='calendar-checkin']")).click();
    d.findElement(By.xpath("//span[text()='22'][1]")).click();
    d.findElement(By.xpath("//span[text()='24'][1]")).click();
    d.findElement(By.xpath("//span[text()='2 Guests']")).click();
    Thread.sleep(2000);
//    d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[2]/div/div/form/div[4]/div/div/div[2]/div/div[1]/div/button[1]")).clear();
//    Thread.sleep(1000);
//    d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[2]/div/div/form/div[4]/div/div/div[2]/div/div[1]/div/button[1]")).sendKeys("1");
//d.findElement(By.xpath("//span[text()='Apply']")).click();
    d.findElement(By.xpath("//input[@type='search']")).sendKeys("Mumbai");
    d.findElement(By.xpath("//button[@type='submit'][1]")).click();
    
    Thread.sleep(2000);
     Select s = new Select(d.findElement(By.id("sorting-selector")));
     Thread.sleep(10000);
        
        s.selectByVisibleText("Rating only");
        Thread.sleep(8000);
        List<WebElement> e = d.findElements(By.xpath("//button[@data-testid='item-name']//span[@itemprop='name']"));
      for(WebElement elements:e)
      {
          System.out.println(elements.getText());
          
      }
      List<WebElement> e2 = d.findElements(By.xpath("//span[@itemprop='ratingValue']"));
      for(WebElement elements2:e2)
      {
          System.out.println(elements2.getText());
          
      }
      List<WebElement> e3 = d.findElements(By.xpath("//div[@class='flex flex-col justify-between']"));
      for(WebElement elements3:e3)
      {
          System.out.println(elements3.getText());
          
      }
     
}

}
