package employeetransferPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeetransfer03_searchFiled extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		driver.findElement(By.id("btnSearch")).sendKeys("Test Employee");
		Thread.sleep(3000);
	}
}
