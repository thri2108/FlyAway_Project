package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_6 {
	
@Test
	public void testcase6() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("http://localhost:9090/FlyAway");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Login/Signup")).click();
	driver.findElement(By.cssSelector("a[href='signup']")).click();
	driver.findElement(By.name("email_id")).sendKeys("pspk2@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("abc@123");
	driver.findElement(By.name("pwd2")).sendKeys("abc@124");
	driver.findElement(By.name("name")).sendKeys("kiran");
	driver.findElement(By.name("address")).sendKeys("surya nagar");
	driver.findElement(By.name("city")).sendKeys("suryapet");
	driver.findElement(By.tagName("button")).click();
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try {
	    // Define the location where you want to save the screenshot
	    File destination = new File("D:\\Course_work\\Capstone_Projects\\Screenshots\\password_validation.png");
	    
	    // Copy the captured screenshot to the specified location
	    FileUtils.copyFile(screenshotFile, destination);
	    
	    System.out.println("Screenshot captured and saved to: " + destination.getAbsolutePath());
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
	WebElement bodyElement = driver.findElement(By.tagName("body"));
	String bodyContent = bodyElement.getText();
	String textTocheck = "Error , Passwords do not match.";
	
	boolean containstext = bodyContent.contains(textTocheck);
	
	if(containstext) {
		System.out.println(textTocheck);
	}
	else {
		System.out.println("The body does not contain:" +textTocheck);
	}
	
driver.quit();	
}
}
