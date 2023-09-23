package rejectedloanproductPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class  rejectedloanprduct02_rejectedLoanProductSearch  extends baseDriver {
	
	
	@ Test
	public void branch() throws InterruptedException {
		driver.findElement(By.id("btnSearch")).sendKeys("Test loan product 1");
		Thread.sleep(2000);		
		
	}
}
