package Rutuja.QT_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_Xpath {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://money.rediff.com/gainers/bse/daily/groupa");
    
}

}
