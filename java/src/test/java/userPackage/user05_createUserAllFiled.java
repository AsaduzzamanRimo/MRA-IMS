package userPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class user05_createUserAllFiled extends baseDriver {


@ Test
public void branch() throws InterruptedException {

	/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	driver.findElement(By.id("profileDropdown")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("convertToEnglishBtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("administration")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("user")).click();
	Thread.sleep(2000);
	*/
	
	driver.findElement(By.id("featureaddbtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("loginId")).sendKeys("01825409809");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("12345678");
	Thread.sleep(2000);
	driver.findElement(By.id("nameEn")).sendKeys("Create test user2");
	Thread.sleep(2000);
	driver.findElement(By.id("nameBn")).sendKeys("পরীক্ষা ব্যবহারকারী তৈরি করুন2");
	Thread.sleep(2000);
	driver.findElement(By.id("contactNo")).sendKeys("01899987670");
	Thread.sleep(2000);
	driver.findElement(By.id("roleOid")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mra-app[1]/app-mra-user[1]/app-mra-user-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("sabina.yeasmin@doer.com.bd");
	Thread.sleep(2000);
	driver.findElement(By.id("savewithworkflowbtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("confirmationModalYesBtn")).click();
	Thread.sleep(2000);
	
}
}
