
package Samity;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Branch.baseDriver;



public class Samity_09_Create_Samity_Correct extends baseDriver {
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


driver.findElement(By.xpath("//button[@id='featureaddbtn']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='nameEn']")).sendKeys("Feni Branch(FB)");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='nameBn']")).sendKeys("ফেনী শাখা (এফবি)");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='centerType']")).sendKeys("Feni Center");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='centerTime']")).sendKeys("12:00 PM");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='samityCode']")).sendKeys("SAM-C-0008");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='registrationNo']")).sendKeys("554362");
Thread.sleep(2000);

driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Comilla Branch')]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='maximumNumber']")).sendKeys("20");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='totalMember']")).sendKeys("20");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='totalBorrower']")).sendKeys("20");
Thread.sleep(2000);

driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/field-builder[1]/div[1]/div[1]/date-picker[1]/div[1]/app-date[1]/div[1]/input[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'18')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/field-builder[1]/div[1]/div[1]/date-picker[1]/div[1]/app-date[1]/div[1]/input[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'21')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Monthly')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[7]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Regular')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Sunday')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[9]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'1st Week')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[10]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[10]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[11]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-mfi-app[1]/div[1]/app-mfi-samity[1]/app-mfi-samity-add[1]/div[2]/dynamic-form-builder[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[12]/field-builder[1]/div[1]/div[1]/dropdown[1]/div[1]/app-select[1]/ng-select[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='location']")).sendKeys("Dhaka");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='workingArea']")).sendKeys("Mohammadpur");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='addressEn']")).sendKeys("Mohammadpur");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='addressBn']")).sendKeys("মোহাম্মদপুর");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("done");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Save Data')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='confirmationModalYesBtn']")).click();
Thread.sleep(2000);



}
}
