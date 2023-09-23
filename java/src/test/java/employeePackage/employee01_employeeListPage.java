package employeePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employee01_employeeListPage extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		
		
		
		/*
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		
		*/
		driver.findElement(By.id("employee-info")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("employee")).click();
		Thread.sleep(3000);
		
		
	}

}
