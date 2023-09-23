package areasPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class areas01_listPage  extends baseDriver{
	@Test
	public void employee() throws InterruptedException {
		driver.findElement(By.id("configuration")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("areas")).click();
		Thread.sleep(3000); 
		
	}
}
