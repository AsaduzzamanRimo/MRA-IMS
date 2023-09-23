package rejectedloanproductPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class rejectedloanprduct01_rejectedLoanproductView extends baseDriver {
	
	
	@ Test
	public void branch() throws InterruptedException {

		driver.findElement(By.id("loan-product-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rejected-loan-product")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("actionbtn_2")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("goToBackBtn")).click();
		Thread.sleep(2000);
		
	}
}
