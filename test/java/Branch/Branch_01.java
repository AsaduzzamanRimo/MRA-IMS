package Branch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Branch_01 {

	
@Test
public void BranchTest_01() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mra-ims.celloscope.net/login");

		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[2]/mat-expansion-panel-header[1]/span[1]/i[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main-shell[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidebar[1]/mat-nav-list[1]/mat-expansion-panel[2]/div[1]/div[1]/mat-nav-list[1]/mat-list-item[1]/span[1]/span[3]")).click();
		Thread.sleep(3000);
}

}
