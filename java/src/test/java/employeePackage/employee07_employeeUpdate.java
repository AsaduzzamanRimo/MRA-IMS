package employeePackage;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;


public class employee07_employeeUpdate extends baseDriver {
	String baseUrl =("https://mra-ims.celloscope.net/");
	
	
	@Test
	public void employee() throws InterruptedException {
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		
		driver.findElement(By.id("employee-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("employee")).click();
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.id("actionbtn_90")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updateandcommitbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(3000);
		
	}

}
