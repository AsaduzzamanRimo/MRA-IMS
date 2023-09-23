
package samityPackage;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samity02_createSamityValid  extends baseDriver {


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

	driver.findElement(By.id("samity-info")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("samity")).click();
	Thread.sleep(3000);


*/
	driver.findElement(By.id("samity-info")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("samity")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("featureaddbtn")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("samityNameEn")).sendKeys("Test samity");
	Thread.sleep(2000);
	driver.findElement(By.id("samityType")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("officeId")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'1002 (Barisal Branch)')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("samityDay")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Saturday')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("maximumMember")).sendKeys("50");
	Thread.sleep(2000);
	driver.findElement(By.id("divisionId")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Barisal Division')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("districtId")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("upazilaId")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Barisal Sadar')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("addressLine1")).sendKeys("Dhaka");
	Thread.sleep(2000);
	driver.findElement(By.id("savewithworkflowbtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("confirmationModalYesBtn")).click();
	Thread.sleep(3000);
	
		}
	
	}
	






