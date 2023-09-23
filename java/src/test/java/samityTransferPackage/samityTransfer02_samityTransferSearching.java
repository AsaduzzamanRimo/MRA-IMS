package samityTransferPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityTransfer02_samityTransferSearching extends baseDriver{
	
	@Test
	public void samityTransfer() throws InterruptedException {
	/*	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
*/
		driver.findElement(By.id("btnSearch")).sendKeys("Test samity");
		Thread.sleep(3000);
		
		
		
		
	}

}
