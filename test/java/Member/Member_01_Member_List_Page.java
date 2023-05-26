package Member;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Branch.baseDriver;

public class Member_01_Member_List_Page extends baseDriver{
	
	String baseUrl =("https://mra-ims.celloscope.net/");
	
	
	@Test
	public void member() throws InterruptedException {
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[5]/mat-expansion-panel-header[1]/span[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[5]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[1]/span[1]/span[3]")).click();
		Thread.sleep(6000);
		
		
		
		
	}
	
	

}
