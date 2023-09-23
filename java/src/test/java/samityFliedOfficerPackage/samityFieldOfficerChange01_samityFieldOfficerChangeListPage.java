package samityFliedOfficerPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityFieldOfficerChange01_samityFieldOfficerChangeListPage extends baseDriver{
	
	
	@Test
	public void samityFieldOfficerChange() throws InterruptedException {
		
		
		driver.findElement(By.id("samity-info")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("samity-field-officer-change")).click();
		Thread.sleep(5000);
		
		
		
	}
	
	

}
