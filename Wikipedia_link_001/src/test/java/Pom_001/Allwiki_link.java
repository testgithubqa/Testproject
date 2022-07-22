package Pom_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allwiki_link {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	

	
	WebElement wiki=driver.findElement(By.xpath("//input[@title='Search']"));
    wiki.sendKeys("Canada - Wikipedia");
    wiki.sendKeys(Keys.ENTER);
    
 
    Thread.sleep(3000);
            List<WebElement> alllink=driver.findElements(By.tagName("a"));
            
            System.out.println("Total tags are"+alllink.size());
            for(int i=0;i<alllink.size();i++)
            {
            	Thread.sleep(3000);
            	System.out.println("All the Links are:"+alllink);
            	//alllink.get(i).getAttribute("href");
            	
            	
            }
	}

}
