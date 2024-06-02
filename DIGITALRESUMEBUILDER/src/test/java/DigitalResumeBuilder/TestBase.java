package DigitalResumeBuilder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class TestBase {
WebDriver driver;
@BeforeTest
public void Setup() {
	driver=new ChromeDriver();
	driver.get("http://167.71.226.96/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
//@AfterTest
//public void  setup2() 
//{
//	driver=new ChromeDriver();
//	driver.get("http://167.71.226.96/profilehome");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//}

}
