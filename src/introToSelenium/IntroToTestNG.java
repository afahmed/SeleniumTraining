package introToSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroToTestNG {
	
	/****
	 *   as a customer I would like to book a flight using delta page
	 *   
	 *   step1: launch browser
	 *   step2: navigate to https://www.delta.com/
	 *   step3: click on from tap
	 *   step4: enter you origin city location (MSP) and hit enter
	 *   step5: 
	 */
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Running setUp() method");
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumStuff\\geckodriver.exe");
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		// impilcit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// maximize my window
		driver.manage().window().maximize();
		
	}
	


	@Test // test annotation
	public void testCase1() {

		// number of ways of finding an element
		
		// 1. Id
		// 2. name
		// 3. class name
		// 4. link text
		// 5. partial link text
		// 6. css
		// 7. tag
		// 8. xpath  (used most)
		// by id
		
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("Ahmed Ali");
	}
	
//	@Test // test annotation
//	public void testCase2() {
//		System.out.println("Running testCase2() method");
//	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Runnign tearDown() method");
	}
	
	
}
