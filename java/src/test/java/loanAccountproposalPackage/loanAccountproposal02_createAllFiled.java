package loanAccountproposalPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class loanAccountproposal02_createAllFiled   extends baseDriver {
	
	
	@ Test
	public void branch() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loan-info")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loan-account-proposal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("officeId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Patuakhali Branch')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("samityId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Test samity (1005-101)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("memberId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Test member')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("lendingCategoryId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Agricultural Development Loans')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("economicPurposeOi")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Agriculture')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("econActivity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Cultivation')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("economicPurposeName")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Major Crops')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loanProductId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-loan-account-proposal[1]/app-mfi-loan-account-proposal-add[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("appliedLoanAmount")).sendKeys("3500");
		Thread.sleep(4000);
		
		driver.findElement(By.id("noInstallment")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-loan-account-proposal[1]/app-mfi-loan-account-proposal-add[1]/form[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("expectedDisburseDt")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/button[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nameEn0")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("nameBn0")).sendKeys("পরীক্ষা");
		Thread.sleep(2000);
		driver.findElement(By.id("contactNo0")).sendKeys("01810176882");
		Thread.sleep(2000);
		driver.findElement(By.id("emailAddress0")).sendKeys("sabina.yeasmin@doer.com.bd");
		Thread.sleep(2000);
		driver.findElement(By.id("relation0")).sendKeys("Yes");
		Thread.sleep(2000);
		driver.findElement(By.id("address0")).sendKeys("Dhaka");
		Thread.sleep(2000);
		driver.findElement(By.id("btn_save")).click();
		Thread.sleep(2000);
		
		
	}
}
