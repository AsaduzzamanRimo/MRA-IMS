package departmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;



public class department06_departmentUpdate extends baseDriver{
	
	@Test
	public void employee() throws InterruptedException {
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
		driver.findElement(By.id("department")).click();
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.id("actionbtn_0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updatebtn")).click();
		Thread.sleep(5000);
	
	}

}
