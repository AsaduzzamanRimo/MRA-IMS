package designationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class designation06_designationByUpdate extends baseDriver{
	
	@Test
	public void employee() throws InterruptedException {
		
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		
		
		driver.findElement(By.id("configuration")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("designation")).click();
		Thread.sleep(3000);
		*/
		driver.findElement(By.id("actionbtn_0")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("updatebtn")).click();
		Thread.sleep(3000);
		
		
	}

}
