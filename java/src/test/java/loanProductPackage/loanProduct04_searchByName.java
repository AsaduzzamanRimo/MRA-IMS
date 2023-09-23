package loanProductPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class   loanProduct04_searchByName extends baseDriver {
	
	
		@ Test
		public void branch() throws InterruptedException {
		/*
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			driver.findElement(By.id("profileDropdown")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("convertToEnglishBtn")).click();
			
			driver.findElement(By.id("mat-expansion-panel-header-7")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("loan-product")).click();
			Thread.sleep(3000);
			*/
			driver.findElement(By.id("btnSearch")).sendKeys("L0010");
			Thread.sleep(2000);
		
		
		
		
		}
}
