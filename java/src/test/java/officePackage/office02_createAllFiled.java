package officePackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class office02_createAllFiled extends baseDriver {


@ Test
public void branch() throws InterruptedException {
/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();

		driver.findElement(By.id("office-info")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("office")).click();
		Thread.sleep(3000);
*/
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("officeNameEn")).sendKeys("Test office");
		Thread.sleep(2000);
		driver.findElement(By.id("officeNameBn")).sendKeys("পরীক্ষা অফিস");
		Thread.sleep(2000);
		driver.findElement(By.id("officeTypeId")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Head Office')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("mfiProgramId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Agroshor')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile1")).sendKeys("01810176882");
		Thread.sleep(2000);
		driver.findElement(By.id("email1")).sendKeys("sabina.yeasmin@doer.com.bd");
		Thread.sleep(2000);
		driver.findElement(By.id("phone1")).sendKeys("01810176882");
		Thread.sleep(2000);
		driver.findElement(By.id("divisionId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Barisal Division')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("districtId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-office[1]/app-mfi-office-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("upazilaId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Barisal Sadar')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("unionId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Raipasha Karapur')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("postOfficeId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-office[1]/app-mfi-office-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("postalCode")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Barisal Sadar (8200)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("wardVillageStreet")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Uttar Kadapur')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addressLine1")).sendKeys("Feni");
		Thread.sleep(2000);
		driver.findElement(By.id("addressLine2")).sendKeys("Feni");
		Thread.sleep(2000);
		driver.findElement(By.id("latitude")).sendKeys("2.45");
		Thread.sleep(2000);
		driver.findElement(By.id("longitude")).sendKeys("4.32");
		Thread.sleep(2000);
		driver.findElement(By.id("savewithworkflowbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(4000);
		
		
}
}
