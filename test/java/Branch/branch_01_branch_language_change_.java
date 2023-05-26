
package Branch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class branch_01_branch_language_change_ extends baseDriver {
String baseUrl =("https://mra-ims.celloscope.net/");


@ Test
public void branch() throws InterruptedException {

driver.get("https://mra-ims.celloscope.net/");
driver.manage().window().maximize();
Thread.sleep(2000);


driver.findElement(By.xpath("//div[@id='profileDropdown']")).click();
Thread.sleep(7000);
driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/mat-radio-group[1]/mat-radio-button[2]/label[1]")).click();
Thread.sleep(6000);
}
}