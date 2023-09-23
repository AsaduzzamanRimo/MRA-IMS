package fundingorganizationPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class fundingorganization02_createValid extends baseDriver {
	@Test
	public void branch() throws InterruptedException {
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
		driver.findElement(By.id("funding-organizations")).click();
		Thread.sleep(3000);
		
		*/
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fundingOrgName")).sendKeys("Test Funding Organizations8");
		Thread.sleep(3000);
		driver.findElement(By.id("loanFundingOrganizationId")).sendKeys("Testi8");
		Thread.sleep(3000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(3000);
	}
}
