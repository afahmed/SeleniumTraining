package introToSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ElementLocators {
	
	private WebDriver driver;
	
  @Test
  public void test1() {
	  
	  
		// 1. Id - okay
		// 2. name
//	  driver.get("https://www.facebook.com/");
//	  WebElement inputText = driver.findElement(By.name("email"));
////	  driver.findElement(By.className("class-name"));
//	  inputText.sendKeys("test@gmail.com");
	  
		// 3. class name - okay
	  
		// 4. link text - anchor tag a-tag
	  driver.get("https://formy-project.herokuapp.com/");
//	  WebElement link = driver.findElement(By.xpath("//a[text()='Formy']"));
	  WebElement link = driver.findElement(By.linkText("Autocomplete"));
	  link.click();
	  
		// 5. partial link text
		// 6. css
		// 7. tag
		// 8. xpath  (used most)
  }
 
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {

	  //first step
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumStuff\\geckodriver.exe");
		
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		// maximize window
		driver.manage().window().maximize();
		// set my wait time 20 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

}
