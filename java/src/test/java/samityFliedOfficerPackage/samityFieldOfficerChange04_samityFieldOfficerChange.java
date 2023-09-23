package samityFliedOfficerPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityFieldOfficerChange04_samityFieldOfficerChange extends baseDriver{
	
	@Test
	public void samityFieldOfficerChange() throws InterruptedException {
		
		
		
		driver.findElement(By.id("actionbtn_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("newFieldOfficerId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'EMP-0002 - Jakir Hossain')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnChange")).click();
		Thread.sleep(2000);
		
		
	}

}
