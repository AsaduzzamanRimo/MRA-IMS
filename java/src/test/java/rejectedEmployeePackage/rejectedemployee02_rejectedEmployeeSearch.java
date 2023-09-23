package rejectedEmployeePackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class  rejectedemployee02_rejectedEmployeeSearch extends baseDriver {


@ Test
public void branch() throws InterruptedException {
	
	driver.findElement(By.id("btnSearch")).sendKeys("Test employee 1");
	Thread.sleep(2000);
	
}
}
