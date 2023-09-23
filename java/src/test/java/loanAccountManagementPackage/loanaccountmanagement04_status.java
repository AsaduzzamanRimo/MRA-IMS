package loanAccountManagementPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class  loanaccountmanagement04_status  extends baseDriver {
	
	
	@ Test
	public void branch() throws InterruptedException {
	/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loan-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loan-account")).click();
		Thread.sleep(4000);
		*/
		driver.findElement(By.id("status")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-loan-account[1]/app-mfi-loan-account-list[1]/div[2]/div[1]/app-data-table[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(3000);
		
		
		
	
}


}
