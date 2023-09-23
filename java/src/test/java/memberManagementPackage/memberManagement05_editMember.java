
package memberManagementPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class memberManagement05_editMember extends baseDriver {
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
		driver.findElement(By.id("actionbtn_90")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.id("updateandcommitbtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(2000);
	
//		String expectedUrl = "https://mra-ims.celloscope.net/mfi/member/list";
//		String actualUrl = driver.getCurrentUrl();
//		
//		Assert.assertEquals(actualUrl, expectedUrl);
//		
	}
}

