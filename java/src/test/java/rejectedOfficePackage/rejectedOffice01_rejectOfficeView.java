package rejectedOfficePackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectedOffice01_rejectOfficeView extends baseDriver {


@ Test
public void branch() throws InterruptedException {
	
	driver.findElement(By.id("office-info")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("rejected-office")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("actionbtn_2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("goToBackBtn")).click();
	Thread.sleep(3000);
}

}
