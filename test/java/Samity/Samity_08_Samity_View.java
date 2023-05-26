package Samity;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Branch.baseDriver;


public class Samity_08_Samity_View extends baseDriver {
String baseUrl =("https://mra-ims.celloscope.net/");


@ Test
public void branch() throws InterruptedException {



//driver.findElement(By.xpath("//div[@id='profileDropdown']")).click();
//Thread.sleep(7000);
//driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/mat-radio-group[1]/mat-radio-button[2]/label[1]")).click();
//Thread.sleep(6000);


//driver.findElement(By.xpath("//body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[4]/mat-expansion-panel-header[1]/span[1]/a[1]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[4]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[1]/span[1]")).click();
//Thread.sleep(2000);

//driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[3]/mat-table[1]/mat-row[3]/mat-cell[8]/button[3]/span[1]/img[1]")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-list[1]/div[2]/div[1]/app-data-table-workflow[1]/div[1]/div[3]/mat-table[1]/mat-row[4]/mat-cell[8]/button[3]/span[1]/img[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-edit[1]/div[2]/dynamic-form-builder[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/app-button[1]/button[1]/span[1]")).click();
Thread.sleep(2000);


}
}
