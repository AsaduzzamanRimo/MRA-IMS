package Role_package;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverpackage.baseDriver;

public class role03_update   extends baseDriver {


@ Test
public void branch() throws InterruptedException {

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	driver.findElement(By.id("profileDropdown")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("convertToEnglishBtn")).click();
	

	driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[1]/span[1]")).click();
	Thread.sleep(2000);


driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mra-app[1]/app-mra-role[1]/app-mra-role-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[3]/mat-table[1]/mat-row[1]/mat-cell[7]/button[2]/span[1]/img[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mra-role[1]/app-mra-role-edit[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[3]/app-button[1]/button[1]/span[1]")).click();
Thread.sleep(2000);
}
}
