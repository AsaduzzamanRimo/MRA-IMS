
package memberManagementPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class memberManagement03_filterByStatus extends baseDriver {
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
		driver.findElement(By.id("status")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		
		/*
		  Select select = new Select(driver.findElement(By.id("undefined")));
		 
		
		select.selectByVisibleText("Active");
		Thread.sleep(2000);
		
		
		String expectedText = "Active";
		String actualText = driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[3]/mat-table[1]/mat-row[1]/mat-cell[7]")).getText();
		
		Assert.assertEquals(actualText, expectedText);
		*/
	}
}

