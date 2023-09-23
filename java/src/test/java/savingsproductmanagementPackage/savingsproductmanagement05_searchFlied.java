package savingsproductmanagementPackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class savingsproductmanagement05_searchFlied extends baseDriver{
	String baseUrl =("https://mra-ims.celloscope.net/");
	@Test
	public void samityTransfer() throws InterruptedException {
		driver.findElement(By.id("btnSearch")).sendKeys("General Savings");
		Thread.sleep(2000);
		
	}
}
