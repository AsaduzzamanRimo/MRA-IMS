
package rejectedMemberPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectedMember02_searchMember extends baseDriver {
	@Test
	public void rejectedMember03() throws InterruptedException {
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("mat-expansion-panel-header-6")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("rejected-member")).click();
		Thread.sleep(5000);
		*/
		driver.findElement(By.id("btnSearch")).sendKeys("Test Member 1");
		Thread.sleep(1000);
		/*
		String dataCheck = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-rejected-list[1]/div[2]/div[1]/app-data-table[1]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		
		if (dataCheck.equals("0 of 0")) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[5]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[1]/span[1]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("featureaddbtn")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("empNameEn")).sendKeys("rejected employee 01");
			driver.findElement(By.id("dateOfBirth")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//tbody/tr[3]/td[3]/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("gender")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("identificationType")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'NID/Smart Card')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("nidNumber")).sendKeys("0378645663");
			driver.findElement(By.id("mobile1")).sendKeys("01747491807");
			driver.findElement(By.xpath("//div[contains(text(),'Employment Information')]")).click();
			driver.findElement(By.id("officeId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'1006 (Pirojpur Branch)')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("emplDesignationId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Assistant Director')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Family Information')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("fatherNameEn")).sendKeys("Test father");
			driver.findElement(By.id("motherNameEn")).sendKeys("Test Mother");
			driver.findElement(By.xpath("//div[contains(text(),'Address')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("resDivisionId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Khulna Division')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("resDistrictId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Magura')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("resUpazilaId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Magura Sadar')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("resAddressLine1")).sendKeys("test");
			Thread.sleep(3000);
			//driver.findElement(By.cssSelector("#permanentAsPresent")).click();
			driver.findElement(By.id("perDivisionId")).click();
			driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("permanentAsPresent")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[contains(text(),'File Information')]")).click();
			driver.findElement(By.id("Photo_Image")).sendKeys("S:\\Automation\\Image\\file_example_JPG_100kB.jpg");
			driver.findElement(By.id("Nid_Front_Part")).sendKeys("S:\\\\Automation\\\\Image\\\\file_example_JPG_100kB.jpg");
			Thread.sleep(2000);
			driver.findElement(By.id("savewithworkflowbtn")).click();
			driver.findElement(By.id("confirmationModalYesBtn")).click();
			Thread.sleep(2000);
			//reject
			driver.findElement(By.id("mat-expansion-panel-header-2")).click();
			driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[3]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[2]/span[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-my-task[1]/app-my-task-employee[1]/app-my-task-employee-pending-approval-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/app-custom-search[1]/input[1]")).sendKeys("rejected employee 01");
			Thread.sleep(2000);
			driver.findElement(By.id("actionbtn_00")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("btnLock")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("btnRejected")).click();
			Thread.sleep(6000);
			//driver.findElement(By.id("approverRemarks")).click();
			//driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-my-task[1]/app-my-task-employee[1]/app-my-task-employee-pending-approval-view[1]/dynamic-modal-builder[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/field-builder[1]/div[1]/div[1]/textbox[1]/div[1]")).sendKeys("test");
			//Thread.sleep(2000);
			WebElement modal = driver.switchTo().activeElement();
			modal.findElement(By.id("approverRemarks")).sendKeys("reject");
			Thread.sleep(2000);
			
			modal.findElement(By.id("savebtn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("mat-expansion-panel-header-2")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("mat-expansion-panel-header-4")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[5]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[2]/span[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-employee[1]/app-mfi-employee-rejected-list[1]/div[2]/div[1]/app-data-table[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/app-custom-search[1]/input[1]")).sendKeys("rejected employee 01");
			Thread.sleep(1000);
			String expectedText = "rejected employee 01";
			String actualText = driver.findElement(By.xpath("//mat-cell[contains(text(),'rejected employee 01')]")).getText();
			Assert.assertEquals(actualText, expectedText);
			
		}
		else {
			String expectedText = "Test Member 1 en";
			String actualText = driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-rejected-list[1]/div[2]/div[1]/app-data-table[1]/div[1]/div[3]/mat-table[1]/mat-row[1]/mat-cell[3]")).getText();
			
			Assert.assertEquals(actualText, expectedText);
			*/
		}
		
		
	}
