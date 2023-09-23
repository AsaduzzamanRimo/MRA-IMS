package samityTransferPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityTransfer03_samityTransferByStatus extends baseDriver{
	
	@Test
	public void samityTransfer() throws InterruptedException {
		
		driver.navigate().refresh();
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
*/
		
		
		driver.findElement(By.id("status")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}
		
		

}
