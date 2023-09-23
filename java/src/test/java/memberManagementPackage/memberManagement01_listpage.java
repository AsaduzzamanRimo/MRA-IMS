
//package memberManagementPackage;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import driverPackage.baseDriver;
//
//public class memberManagement01_pageView extends baseDriver {
//	@Test
//	public void memberManagement01 () throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		Thread.sleep(5000);
//		driver.findElement(By.id("profileDropdown")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("convertToEnglishBtn")).click(); 
//		Thread.sleep(2000);
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("member-info")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("member")).click();
//		Thread.sleep(5000);
//		
//		String expectedUrl = "https://mra-ims.celloscope.net/mfi/member/list";
//		String actualUrl = driver.getCurrentUrl();
//		
//		Assert.assertEquals(actualUrl, expectedUrl);
//	}
//}

package memberManagementPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class memberManagement01_listpage extends baseDriver {
	@Test
	public void memberManagement01 () throws InterruptedException {
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(7000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click(); 
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		*/
		driver.findElement(By.id("member-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("member")).click();
		Thread.sleep(5000);
		
//		String expectedUrl = "https://mra-ims.celloscope.net/mfi/member/list";
//		String actualUrl = driver.getCurrentUrl();
//		
//		Assert.assertEquals(actualUrl, expectedUrl);
	}
}
