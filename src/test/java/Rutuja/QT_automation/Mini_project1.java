package Rutuja.QT_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mini_project1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement element = driver.findElement(By.id("s-result-sort-select"));
		//element.click();
		Select s = new Select(element);
		List<WebElement> li = s.getOptions();
		//int listCount=li.size();
		System.out.println("listcount is :"+(li.size()-1));
		s.selectByVisibleText("Newest Arrivals");
		WebElement expectedtitle = driver.findElement(By.xpath("//span[text()='Newest Arrivals']"));
		Boolean result=expectedtitle.isDisplayed();
		System.out.println(result);
		if(result==true)
		{
			System.out.println("Newest Arrivals option is selected");
		}
		else
		{
			System.out.println("Newest Arrivals option is not selected");
		}
		//driver.close();
	}
}
