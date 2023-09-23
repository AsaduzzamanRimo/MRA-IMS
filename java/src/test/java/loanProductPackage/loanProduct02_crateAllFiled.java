package loanProductPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class loanProduct02_crateAllFiled extends baseDriver {


	@ Test
	public void branch() throws InterruptedException {
	/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		
		driver.findElement(By.id("mat-expansion-panel-header-7")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loan-product")).click();
		Thread.sleep(3000);
		*/
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mfiProgramId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AGRO-Agroshor')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("loanProductNameEn")).sendKeys("Test loan product");
		Thread.sleep(2000);
		driver.findElement(By.id("loanProductNameBn")).sendKeys("পরীক্ষা ঋণ পণ্য");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loanProductDisplayName")).sendKeys("Test loan product");
		Thread.sleep(2000);
		driver.findElement(By.id("descProduct")).sendKeys("done");
		Thread.sleep(2000);
		driver.findElement(By.id("productNature")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-loan-product[1]/app-mfi-loan-product-add[1]/div[2]/dynamic-form-builder-workflow[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loanTypeId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Single Installment')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("minLoanAmount")).sendKeys("3000");
		Thread.sleep(2000);
		driver.findElement(By.id("maxLoanAmount")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.id("interestCalcMethod")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("serviceChargeRate")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.id("savewithworkflowbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(2000);
		
		
	}
}
