package rejectedEmployeePackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectedemployee01_rejectedEmployeeView  extends baseDriver {


@ Test
public void branch() throws InterruptedException {
	
	driver.findElement(By.id("employee-info")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("rejected-employee")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("actionbtn_2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("goToBackBtn")).click();
	Thread.sleep(3000);

	
	
	
}
}
