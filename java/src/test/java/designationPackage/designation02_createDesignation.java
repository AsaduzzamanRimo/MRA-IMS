package designationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class designation02_createDesignation extends baseDriver{
	

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
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("empDesignationEn")).sendKeys("Test Designation");
		Thread.sleep(3000);
		driver.findElement(By.id("empDesignationBn")).sendKeys("টেস্ট পদবী ");
		Thread.sleep(3000);
		driver.findElement(By.id("empDesignationShortName")).sendKeys("Test");
		Thread.sleep(3000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(3000);
		
	}
		

}
