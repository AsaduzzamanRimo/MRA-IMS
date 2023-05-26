package Member;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Branch.baseDriver;

public class Member_03_Member_By_Status extends baseDriver{
	
	String baseUrl =("https://mra-ims.celloscope.net/");
	
	
	@Test
	public void member() throws InterruptedException {
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-member[1]/app-mfi-member-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		
		
		
		
	}

}
