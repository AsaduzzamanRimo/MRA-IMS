package savingsproductmanagementPackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class savingsproductmanagement03_View extends baseDriver{
	String baseUrl =("https://mra-ims.celloscope.net/");
	@Test
	public void samityTransfer() throws InterruptedException {
		driver.findElement(By.id("actionbtn_01")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("goToBackBtn")).click();
		Thread.sleep(2000);

		
	}
}
