package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_5 {
	@Test
	public void testcase5() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("http://localhost:9090/FlyAway");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Login/Signup")).click();
	driver.findElement(By.cssSelector("a[href='signup']")).click();
	driver.findElement(By.name("email_id")).sendKeys("pspk3@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("abc@123");
	driver.findElement(By.name("pwd2")).sendKeys("abc@123");
	driver.findElement(By.name("name")).sendKeys("kiran");
	driver.findElement(By.name("address")).sendKeys("surya nagar");
	driver.findElement(By.name("city")).sendKeys("suryapet");
	WebElement error = driver.findElement(By.cssSelector("html"));
	System.out.println(error);
}
	
}
