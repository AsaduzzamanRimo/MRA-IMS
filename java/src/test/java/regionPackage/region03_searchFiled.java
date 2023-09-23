package regionPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class   region03_searchFiled  extends baseDriver{
	@Test
	public void employee() throws InterruptedException {
		driver.findElement(By.id("btnSearch")).sendKeys("REGION-001");
		Thread.sleep(3000); 
		
		
		
	}
}
