package Member;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Branch.baseDriver;

public class Member_05_Member_Lock extends baseDriver{
	
	String baseUrl =("https://mra-ims.celloscope.net/");
	
	@Test
	public void member() throws InterruptedException {
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[3]/mat-table[1]/mat-row[1]/mat-cell[10]/button[1]/span[1]/img[1]")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("")).click();
		//Thread.sleep(6000);
		
		
		
		
	}

}
