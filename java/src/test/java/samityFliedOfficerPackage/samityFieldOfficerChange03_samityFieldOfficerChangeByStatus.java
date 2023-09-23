package samityFliedOfficerPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityFieldOfficerChange03_samityFieldOfficerChangeByStatus extends baseDriver{
	
	@Test
	public void samityFieldOfficerChange() throws InterruptedException {
		
		
		
		
		driver.findElement(By.id("status")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
