package employeePackage;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;


public class employee05_employeeView extends baseDriver {
	
	
	
	@Test
	public void employee() throws InterruptedException {	
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		
		driver.findElement(By.id("employee-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("employee")).click();
		Thread.sleep(3000);
		*/
		driver.findElement(By.id("actionbtn_92")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("goToBackBtn")).click();
		Thread.sleep(3000);
	}

}
