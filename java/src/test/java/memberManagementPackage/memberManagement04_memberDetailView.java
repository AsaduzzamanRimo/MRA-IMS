
package memberManagementPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class memberManagement04_memberDetailView extends baseDriver {
	@Test
	public void membermangement04() throws InterruptedException {
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("mat-expansion-panel-header-6")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("member")).click();
		Thread.sleep(5000);
		*/
		driver.findElement(By.id("btnSearch")).sendKeys("Test member");
		Thread.sleep(2000);
		driver.findElement(By.id("actionbtn_02")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("goToBackBtn")).click();
		Thread.sleep(2000);
//		String expectedUrl = "https://mra-ims.celloscope.net/mfi/member/view/20230704-084724-ZMwjkmNsN8u7hAs";
//		String actualUrl = driver.getCurrentUrl();
//		
//		Assert.assertEquals(actualUrl, expectedUrl);
//		
	}
}

