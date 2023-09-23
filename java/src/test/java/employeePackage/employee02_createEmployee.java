package employeePackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employee02_createEmployee extends baseDriver{
	
	@Test
	public void employee() throws InterruptedException {
		
		driver.findElement(By.id("employee-info")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("featureaddbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("empNameEn")).sendKeys("Test Employee");
		Thread.sleep(2000);
		driver.findElement(By.id("empNameBn")).sendKeys("পরীক্ষা কর্মচারী");
		Thread.sleep(2000);
		driver.findElement(By.id("dateOfBirth")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'19')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("bloodGroup")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'A+')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("maritalStatus")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Divorced')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("religion")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Islam')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("academicQualification")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Post-Graduation')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tinNo")).sendKeys("234567");
		Thread.sleep(2000);
		driver.findElement(By.id("identificationType")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'NID/Smart Card')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nidNumber")).sendKeys("6534289675");
		Thread.sleep(2000);
		driver.findElement(By.id("nidIssueDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'19')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile1")).sendKeys("01810176882");
		Thread.sleep(2000);
		driver.findElement(By.id("personalEmail1")).sendKeys("sabina.yeasmin.9701@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("officialEmail1")).sendKeys("sabina.yeasmin@doer.com.bd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Employment Information')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("officeId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'1002 (Barisal Branch)')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("departmentId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Board of Directors')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("emplDesignationId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Branch Manager')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("roleId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Family Information')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fatherNameEn")).sendKeys("Nur Ahamed");
		Thread.sleep(3000);
		driver.findElement(By.id("motherNameEn")).sendKeys("Halema Begum");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Address')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resDivisionId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Barisal Division')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resDistrictId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resUpazilaId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Barisal Sadar')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resUnionId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Raipasha Karapur')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resPostOfficeId")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resPostalCode")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Barisal Sadar (8200)')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resWardVillageStreet")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Uttar Kadapur')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("resAddressLine1")).sendKeys("Dhaka");
		Thread.sleep(3000);
		driver.findElement(By.id("permanentAsPresent")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'File Information')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Photo_Image")).sendKeys("/home/doer/Downloads/oc-gonzalez-FbN2z3bEaSs-unsplash (2).jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("Nid_Front_Part")).sendKeys("/home/doer/Downloads/sallie-michalsky-t4Om5jdVWjw-uns.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("Nid_Back_Part")).sendKeys("/home/doer/Downloads/robert-thiemann-I9ZjXEvp_J0-unsp.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("Tin_Document")).sendKeys("/home/doer/Downloads/fuji-mountain-kawaguchiko-lake-m.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("savewithworkflowbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(3000);
	
		
		
		
		
	}
}
