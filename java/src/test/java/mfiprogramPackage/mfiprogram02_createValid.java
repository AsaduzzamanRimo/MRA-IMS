package mfiprogramPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class  mfiprogram02_createValid extends baseDriver {
	@Test
	public void branch() throws InterruptedException {
/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		

		driver.findElement(By.id("configuration")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mfi-program")).click();
		Thread.sleep(3000);
		*/
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mfiProgramNameEn")).sendKeys("Test mfi-program");
		Thread.sleep(3000);
		driver.findElement(By.id("mfiProgramNameBn")).sendKeys("এমএফআই-প্রোগ্রাম পরীক্ষা ");
		Thread.sleep(3000);
		driver.findElement(By.id("mfiProgramShortName")).sendKeys("Test");
		Thread.sleep(3000);
		driver.findElement(By.id("loanFundId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'TESTID-01')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(3000);
		
	}
}
