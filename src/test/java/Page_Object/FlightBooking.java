package Page_Object;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {

public void flightbooking() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://localhost:9090/FlyAway/registerconfirm");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login to continue checking flights")).click();
		driver.findElement(By.name("email_id")).sendKeys("pspk2@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("surya@123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.cssSelector("a[href='home']")).click();
		

		Select src = new Select(driver.findElement(By.xpath("//select[@name='source']")));
		src.selectByValue("11");
		Select dstn = new Select(driver.findElement(By.xpath("//select[@name='destination']")));
		dstn.selectByValue("7");
		driver.findElement(By.tagName("button")).click();
		
	    driver.findElement(By.cssSelector("a[href='bookflight?id=5']")).click();
	    
	    driver.findElement(By.linkText("Click to complete booking")).click();
	 // Capture a screenshot as a File object
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
		    // Define the location where you want to save the screenshot
		    File destination = new File("D:\\Course_work\\Capstone_Projects\\Screenshots\\bookedflight.png");
		    
		    // Copy the captured screenshot to the specified location
		    FileUtils.copyFile(screenshotFile, destination);
		    
		    System.out.println("Screenshot captured and saved to: " + destination.getAbsolutePath());
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    driver.quit();
		
		}
}
