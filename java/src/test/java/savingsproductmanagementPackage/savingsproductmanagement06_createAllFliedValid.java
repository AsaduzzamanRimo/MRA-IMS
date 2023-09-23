package savingsproductmanagementPackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class  savingsproductmanagement06_createAllFliedValid extends baseDriver{
	String baseUrl =("https://mra-ims.celloscope.net/");
	@Test
	public void samityTransfer() throws InterruptedException {
		
		
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'VS-Voluntary Savings')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("undefined")).sendKeys("Voluntary Savings");
		Thread.sleep(2000);
		driver.findElement(By.id("")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'TESTID-01-02-TEST')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Tiered Per Balance')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'% per week')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("interest_tier0")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("maxBalance0")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("interestRate0")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Minimum Daily Balance')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("//span[contains(text(),'Monthly')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Weeks')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-savings-product[1]/app-mfi-savings-product-add[1]/form[1]/div[2]/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		
		
	}
			
	}

