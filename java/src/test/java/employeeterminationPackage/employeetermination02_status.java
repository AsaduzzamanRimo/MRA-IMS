package employeeterminationPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeetermination02_status extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		driver.findElement(By.id("status")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("//span[contains(text(),'All')]")).click();
		Thread.sleep(2000);
		
		
		
	}
}
