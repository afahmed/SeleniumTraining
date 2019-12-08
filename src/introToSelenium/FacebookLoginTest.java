package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumStuff\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		
		// launch the application
		String baseURL = "https://www.facebook.com/";
		driver.get(baseURL);
		
		// find the element and write/send the text 'test@email.com'
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("loginbutton")).click();

	}

}
