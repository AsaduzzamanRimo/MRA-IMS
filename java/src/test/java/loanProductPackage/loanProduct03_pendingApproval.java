package loanProductPackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import driverPackage.baseDriver;

public class loanProduct03_pendingApproval  extends baseDriver {


	@ Test
	public void branch() throws InterruptedException {
	/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("convertToEnglishBtn")).click();
		Thread.sleep(2000);
		*/
		driver.findElement(By.id("my-task")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("my-task-loan-product")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("actionbtn_00")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("btnLock")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("btnApproved")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(2000);
		
		
		
	}
}
