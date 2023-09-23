package savingsproductmanagementPackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class savingsproductmanagement02_status extends baseDriver{
	String baseUrl =("https://mra-ims.celloscope.net/");
	@Test
	public void samityTransfer() throws InterruptedException {
		driver.findElement(By.id("status")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(2000);
	}
}
