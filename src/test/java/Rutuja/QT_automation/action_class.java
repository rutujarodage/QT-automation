package Rutuja.QT_automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_class {
	 public static void main(String[] args) {
	        WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver();
	        d.manage().window().maximize();
	        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
	      WebElement  Btn=d.findElement(By.xpath("//button[@name=\"dblClick\"]"));
	      Actions act = new Actions(d);
	    //  act.doubleClick(Btn).build().perform();
	      WebElement src = d.findElement(By.id("draggable"));
	      WebElement dest = d.findElement(By.id("droppable"));
	      act.dragAndDrop(src, dest).build().perform();
	      

}
}

