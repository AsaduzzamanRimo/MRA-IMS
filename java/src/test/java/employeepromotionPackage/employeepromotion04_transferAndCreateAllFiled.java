package employeepromotionPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeepromotion04_transferAndCreateAllFiled extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		driver.findElement(By.id("actionbtn_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("newDepartmentId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-employee-promotion[1]/app-mfi-employee-promotion-form[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("newDesignationId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-employee-promotion[1]/app-mfi-employee-promotion-form[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("newRole")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-employee-promotion[1]/app-mfi-employee-promotion-form[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("effectiveDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'23')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnChange")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(2000);
		
		
	}
}
