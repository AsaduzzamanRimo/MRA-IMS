package rejectedOfficePackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectedOffice02_rejectOfficeSearch extends baseDriver {


@ Test
public void branch() throws InterruptedException {
	
	
	driver.findElement(By.id("btnSearch")).sendKeys("Test Office 1");
	Thread.sleep(3000);
	
	}
}
