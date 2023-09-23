
package rejectedMemberPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverPackage.baseDriver;

public class rejectedMember01_rejectedMemberView extends baseDriver {
	@Test
	public void rejectedMember04() throws InterruptedException {
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.navigate().refresh();
		
		
		
//		Thread.sleep(3000);
//		driver.findElement(By.id("profileDropdown")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("convertToEnglishBtn")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("mat-expansion-panel-header-6")).click();
//		Thread.sleep(1000);
		
		
		driver.findElement(By.id("member-info")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rejected-member")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("actionbtn_2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("goToBackBtn")).click();
		Thread.sleep(2000);
	}
}



