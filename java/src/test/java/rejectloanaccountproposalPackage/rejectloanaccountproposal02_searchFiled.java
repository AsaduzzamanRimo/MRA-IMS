package rejectloanaccountproposalPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectloanaccountproposal02_searchFiled extends baseDriver {


@ Test
public void branch() throws InterruptedException {
	
	driver.findElement(By.id("btnSearch")).sendKeys("LN-APl6927-0362");
	Thread.sleep(3000);
}

}
