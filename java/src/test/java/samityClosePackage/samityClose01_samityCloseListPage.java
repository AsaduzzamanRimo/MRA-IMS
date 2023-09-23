package samityClosePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samityClose01_samityCloseListPage extends baseDriver{
	
	@Test
	public void samityClose() throws InterruptedException {
		
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("samity-info")).click();
		Thread.sleep(7000); 
		*/
		
		driver.findElement(By.id("samity-close")).click();
		Thread.sleep(5000);
		
		
	}

}
