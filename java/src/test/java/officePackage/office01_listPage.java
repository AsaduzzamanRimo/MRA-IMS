package officePackage;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class office01_listPage extends baseDriver {


@ Test
public void branch() throws InterruptedException {
/*
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	driver.findElement(By.id("profileDropdown")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("convertToEnglishBtn")).click();
	
*/

	driver.findElement(By.id("office-info")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("office")).click();
	Thread.sleep(3000);

}

}
