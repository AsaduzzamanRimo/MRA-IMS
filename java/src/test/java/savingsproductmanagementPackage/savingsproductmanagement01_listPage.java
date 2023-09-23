package savingsproductmanagementPackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class savingsproductmanagement01_listPage extends baseDriver{
	String baseUrl =("https://mra-ims.celloscope.net/");
	@Test
	public void samityTransfer() throws InterruptedException {
		
		driver.findElement(By.id("savings-product-info")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("savings-product")).click();
		Thread.sleep(2000);
	}
}
