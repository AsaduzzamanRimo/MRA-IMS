package Samity;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Branch.baseDriver;



public class Samity_05_Samity_Lock extends baseDriver {
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

driver.findElement(By.xpath("//img[@id='lockButtonImg_3']")).click();
Thread.sleep(2000);




}
}
