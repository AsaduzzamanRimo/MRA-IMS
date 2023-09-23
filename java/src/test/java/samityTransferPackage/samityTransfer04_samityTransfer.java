package samityTransferPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityTransfer04_samityTransfer extends baseDriver{
	
	@Test
	public void samityTransfer() throws InterruptedException {
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);

		driver.navigate().refresh();
		
		driver.findElement(By.id("samity-info")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("samity-transfer")).click();
		Thread.sleep(2000);
		*/
		driver.findElement(By.id("actionbtn_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("newOfficeId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Patuakhali Branch')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnTransfer")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
