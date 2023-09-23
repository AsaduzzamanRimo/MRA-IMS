package areasPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class areas03_searchFlied extends baseDriver{
	@Test
	public void employee() throws InterruptedException {
		driver.findElement(By.id("btnSearch")).sendKeys("AREA-001");
		Thread.sleep(3000); 
		
	}
}
