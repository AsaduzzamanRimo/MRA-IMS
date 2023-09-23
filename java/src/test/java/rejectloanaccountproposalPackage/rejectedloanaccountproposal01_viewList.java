package rejectloanaccountproposalPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectedloanaccountproposal01_viewList extends baseDriver {


@ Test
public void branch() throws InterruptedException {

	
	driver.findElement(By.id("loan-info")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("rejected-loan-account-proposal")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("actionbtn_1")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("goToBackBtn")).click();
	Thread.sleep(3000);
	
	
}

}
