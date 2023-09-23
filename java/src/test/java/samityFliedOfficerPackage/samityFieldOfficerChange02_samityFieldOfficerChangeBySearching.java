package samityFliedOfficerPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityFieldOfficerChange02_samityFieldOfficerChangeBySearching extends baseDriver{
	
	@Test
	public void samityFieldOfficerChange() throws InterruptedException {
		
	
		
		driver.findElement(By.id("btnSearch")).sendKeys("1002-102");
		Thread.sleep(2000);
		
	}

}
