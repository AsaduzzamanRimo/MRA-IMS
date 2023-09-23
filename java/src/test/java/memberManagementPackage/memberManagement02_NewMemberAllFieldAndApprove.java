
package memberManagementPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class memberManagement02_NewMemberAllFieldAndApprove extends baseDriver {
	@Test
	public void membermangement05() throws InterruptedException {
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("member-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("member")).click();
		Thread.sleep(5000);
		*/
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("officeId")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//span[contains(text(),'1005 (Patuakhali Branch)')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("samityId")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'1005-101 (Test samity (1005-101))')]")).click();
		
		driver.findElement(By.id("memberNameEn")).sendKeys("Test Member");
		Thread.sleep(1000);

		driver.findElement(By.id("memberNameBn")).sendKeys("Test Member");
		Thread.sleep(1000);

		driver.findElement(By.id("dateOfBirth")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/button[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bloodGroup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'O+')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("religion")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Islam')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("academicQualification")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Pre-Primary')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("occupation")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Aagriculture')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("maritalStatus")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Unmarried')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("tinNo")).sendKeys("1234");
		Thread.sleep(2000);

		driver.findElement(By.id("identificationType")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//span[contains(text(),'NID/Smart Card')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("nidNumber")).sendKeys("1234567891");
		Thread.sleep(2000);

		driver.findElement(By.id("mobile1")).sendKeys("01810176882");
		Thread.sleep(1000);
		
		driver.findElement(By.id("email1")).sendKeys("sabina.yeasmin@doer.com.bd");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[contains(text(),'Family Information')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fatherNameEn")).sendKeys("Nur Ahamed");
		Thread.sleep(2000);

		driver.findElement(By.id("fatherNameBn")).sendKeys("নুর আহমেদ");
		Thread.sleep(2000);

		driver.findElement(By.id("motherNameEn")).sendKeys("Halema Begum");
		Thread.sleep(2000);

		driver.findElement(By.id("motherNameBn")).sendKeys("হালেমা বেগম");
		Thread.sleep(2000);

		driver.findElement(By.id("emergencyContactPerson")).sendKeys("Test");
		Thread.sleep(2000);

		driver.findElement(By.id("emergencyContactNumber")).sendKeys("01810176882");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Address')]")).click();
		Thread.sleep(1000);
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

		
		driver.findElement(By.id("resUnionId")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'04 No. Baghia Union')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("resPostOfficeId")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("resPostalCode")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Magura Sadar (7600)')]")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("resAddressLine1")).sendKeys("Test Address");
		Thread.sleep(2000);

		driver.findElement(By.id("resAddressLine2")).sendKeys("test address line 2");
		Thread.sleep(2000);

		driver.findElement(By.id("permanentAsPresent")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Other Information')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remarks")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Tribal')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("noOfDependents")).sendKeys("2");
		Thread.sleep(2000);

		driver.findElement(By.id("incomeSource")).sendKeys("Farming");
		Thread.sleep(2000);

		driver.findElement(By.id("isMicroEnName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("microEnName")).sendKeys("Test Enterprise");
		Thread.sleep(2000);

		driver.findElement(By.id("microLegalForm")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'NGO')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'File Information')]")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.id("Photo_Image")).sendKeys("/home/doer/Downloads/sallie-michalsky-t4Om5jdVWjw-uns.jpg");
		Thread.sleep(3000); 
		driver.findElement(By.id("Nid_Front_Part")).sendKeys("/home/doer/Downloads/fuji-mountain-kawaguchiko-lake-m.jpg");
		Thread.sleep(3000); 
		driver.findElement(By.id("Nid_Back_Part")).sendKeys("/home/doer/Downloads/sallie-michalsky-t4Om5jdVWjw-uns.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("Tin_Document")).sendKeys("/home/doer/Downloads/fuji-mountain-kawaguchiko-lake-m.jpg");
		Thread.sleep(3000);
        
        driver.findElement(By.id("savewithworkflowbtn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("confirmationModalYesBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("my-task")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("my-task-member")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("actionbtn_70")).click();
        driver.findElement(By.id("btnLock")).click();
        driver.findElement(By.id("btnApproved")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("savebtn")).click();
        Thread.sleep(2000);
    	driver.findElement(By.id("member-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("member")).click();
		Thread.sleep(5000); 
       
	}
	
}

