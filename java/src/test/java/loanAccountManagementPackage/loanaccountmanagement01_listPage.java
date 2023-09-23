package loanAccountManagementPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class loanaccountmanagement01_listPage   extends baseDriver {
	
	
	@ Test
	public void branch() throws InterruptedException {
	/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		*/
		driver.findElement(By.id("loan-info")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("loan-account")).click();
		Thread.sleep(4000);
		
		
		
	}
}
