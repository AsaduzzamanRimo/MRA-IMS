package designationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class designation05_designationNameSearch extends baseDriver{
	
	@Test
	public void employee() throws InterruptedException {
		
	/*	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		*/
		driver.findElement(By.id("btnSearch")).sendKeys("EMP-DSG-0007");
		Thread.sleep(3000);
		
		
	}
		

}
