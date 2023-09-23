package Role_package;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class role05_searchName   extends baseDriver {
String baseUrl =("https://mra-ims.celloscope.net/");


@ Test
public void branch() throws InterruptedException {
/*
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.navigate().refresh();

	Thread.sleep(5000);
	driver.findElement(By.id("profileDropdown")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("convertToEnglishBtn")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("administration")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("role")).click();
	Thread.sleep(2000);

*/
	driver.findElement(By.id("btnSearch")).sendKeys("MFI Admin");
	Thread.sleep(2000);

	
	
}
}
