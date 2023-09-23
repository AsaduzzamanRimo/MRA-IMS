package departmentPackage;



import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class department02_createDepartment extends baseDriver{
	
	@Test
	public void employee() throws InterruptedException {
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("configuration")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("department")).click();
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nameEn")).sendKeys("Test department");
		Thread.sleep(2000);
		driver.findElement(By.id("nameBn")).sendKeys("পরীক্ষা বিভাগ");
		Thread.sleep(2000);
		driver.findElement(By.id("status")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-employee-department[1]/app-mfi-employee-department-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(2000);
		
		
	}
		
		
		

}
