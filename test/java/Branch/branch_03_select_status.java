
package Branch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class branch_03_select_status extends baseDriver {
String baseUrl =("https://mra-ims.celloscope.net/");


@ Test
public void branch() throws InterruptedException {




//driver.findElement(By.xpath("//div[@id='profileDropdown']")).click();
//Thread.sleep(7000);
//driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/mat-radio-group[1]/mat-radio-button[2]/label[1]")).click();
//Thread.sleep(6000);



//driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[2]/mat-expansion-panel-header[1]/span[1]/a[1]")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[2]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[1]/span[1]/span[3]")).click();
//Thread.sleep(4000);



driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-branch[1]/app-mfi-branch-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Active')]")).click();
Thread.sleep(3000);
}
}
