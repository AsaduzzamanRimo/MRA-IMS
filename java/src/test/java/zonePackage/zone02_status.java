package zonePackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class   zone02_status extends baseDriver{
	@Test
	public void employee() throws InterruptedException {
		driver.findElement(By.id("status")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-region[1]/app-mfi-region-list[1]/div[2]/div[1]/app-data-table[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(3000); 
		
		
	}
}
