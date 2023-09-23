package userPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class user02_userView   extends baseDriver {


@ Test
public void branch() throws InterruptedException {

	/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	driver.findElement(By.id("profileDropdown")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("convertToEnglishBtn")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("administration")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("user")).click();
	Thread.sleep(2000);
	*/
	driver.findElement(By.id("actionbtn_22")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnBack")).click();
	Thread.sleep(2000);
}
}
