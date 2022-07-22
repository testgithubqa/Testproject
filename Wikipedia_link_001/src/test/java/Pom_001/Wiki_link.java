package Pom_001;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




import io.github.bonigarcia.wdm.WebDriverManager;


public class Wiki_link {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	

	
	WebElement wiki=driver.findElement(By.xpath("//input[@title='Search']"));
    wiki.sendKeys("about canada");
    wiki.sendKeys(Keys.ENTER);
    
    
    WebElement validlink=driver.findElement(By.partialLinkText("Canada - Wikipedia"));
    validlink.click();
    WebElement  invalidlink=driver.findElement(By.partialLinkText("appledia"));
    invalidlink.click();
    
  //  driver.close();
    
 
    }
  

	}



