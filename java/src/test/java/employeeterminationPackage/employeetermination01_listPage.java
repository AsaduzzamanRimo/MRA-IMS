package employeeterminationPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeetermination01_listPage extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		driver.findElement(By.id("employee-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("employee-termination")).click();
		Thread.sleep(2000);
	
		
		
	}
}
