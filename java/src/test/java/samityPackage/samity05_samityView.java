package samityPackage;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class samity05_samityView extends baseDriver {


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


	driver.findElement(By.id("samity-info")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("samity")).click();
	Thread.sleep(3000);
*/

	driver.findElement(By.id("actionbtn_02")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("goToBackBtn")).click();
	Thread.sleep(2000);

	
	}
}
