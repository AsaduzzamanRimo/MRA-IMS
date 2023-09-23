package employeepromotionPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeepromotion03_searchFiled extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		

		driver.findElement(By.id("btnSearch")).sendKeys("Test Employee");
		Thread.sleep(2000);
		
		
	}
}
