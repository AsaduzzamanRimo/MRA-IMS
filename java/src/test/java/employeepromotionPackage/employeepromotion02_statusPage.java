package employeepromotionPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeepromotion02_statusPage extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		driver.findElement(By.id("status")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}
}
