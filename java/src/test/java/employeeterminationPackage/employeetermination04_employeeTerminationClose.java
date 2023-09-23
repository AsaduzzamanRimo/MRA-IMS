package employeeterminationPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class employeetermination04_employeeTerminationClose extends baseDriver {
	@Test
	public void employee() throws InterruptedException {
		
		
		driver.findElement(By.id("actionbtn_1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("editbtn")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmationModalYesBtn")).click();
		Thread.sleep(3000);
		
		
		
	}
}
