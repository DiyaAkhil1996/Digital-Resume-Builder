package ict.kerala.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public void Setusername(String Uname) 
{
	WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
	usrname.sendKeys(Uname);
	
}
public void Setpassword(String Pssd)
{
	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys(Pssd);
	
}
public void checkbox()
{
	WebElement check=driver.findElement(By.xpath("//label[@for='checkbox']"));
	check.click();
	
}
public void login()
{
	WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
	login.click();
	
}
public void logout()
{
	WebElement logout=driver.findElement(By.xpath("//a[@class='logout btn']"));
	logout.click();
}
public void home()
{
	WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
			home.click();
}
public void signup()
{
	WebElement signup=driver.findElement(By.xpath("//a[normalize-space()='Signup now']"));
	signup.click();
}
public void forgot()
{
WebElement forgt=driver.findElement(By.xpath("//a[@class='txt1']"));
forgt.click();
}

public void Resumebuild()
{
	WebElement Profile=driver.findElement(By.xpath("//a[normalize-space()='My Profile']"));
	Profile.click();
}

public void create()
{
	WebElement creat=driver.findElement(By.xpath("//button[@class='btn-get-started animate__animated animate__fadeInUp scrollto']"));
creat.click();
}
//public void usern(String name) 
//{
//	WebElement user=driver.findElement(By.xpath("//input[@id='name']"));
//	user.sendKeys(name);
//}
public void dob(String dd) 
{
	WebElement birth=driver.findElement(By.xpath("//input[@id='date']"));
birth.sendKeys(dd);
}
public void dob2(String mm) 
{
WebElement birth2=driver.findElement(By.xpath("//input[@id='date']"));
birth2.sendKeys(mm);
}
public void dob3(String yyyy) 
{
WebElement birth2=driver.findElement(By.xpath("//input[@id='date']"));
birth2.sendKeys(yyyy);
}
public void gender() 
{
	WebElement gen=driver.findElement(By.xpath("//p[contains(text(),'Male')]//input[2]"));
gen.click();
}
//public void mail (String id) 
//{
//	WebElement email=driver.findElement(By.xpath("//input[@id='email_id']"));
//email.sendKeys(id);
//	
//}
//public void phone (String mob) 
//{
//	WebElement ph=driver.findElement(By.xpath("//input[@id='phone']"));
//ph.sendKeys(mob);
//}
public void high() throws InterruptedException 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
	Thread.sleep(1000); // wait for 1 second
	WebElement element = driver.findElement(By.xpath("//select[@id='edu_title']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement hs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='edu_title']")));
	element.click();
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
element.click();
}
public void high2() 
{
	WebElement hs2=driver.findElement(By.xpath("//select[@id='edu_title']//option[@value='Board of Public Examination'][normalize-space()='Board of Public Examination']"));
hs2.click();
}
public void high3() 
{
	WebElement hs3=driver.findElement(By.xpath("//select[@id='edu_title']//option[@value='CBSC'][normalize-space()='CBSC']"));
hs3.click();
}
public void high4() 
{
	WebElement hs4=driver.findElement(By.xpath("//select[@id='edu_title']//option[@value='others'][normalize-space()='other']"));
hs4.click();
}
public void hiper(String perc) 
{
	WebElement hsp=driver.findElement(By.xpath("//input[@id='edu_desc']"));
hsp.sendKeys(perc);
}
public void hinam(String namesc) 
{
	WebElement hiname=driver.findElement(By.xpath("//input[@id='edu_school']"));
hiname.sendKeys(namesc);
}

public void hiyear(String hiyear) 
{
	WebElement year=driver.findElement(By.xpath("//input[@id='edu_year']"));
year.sendKeys(hiyear);
}
public void logout2()
{
	WebElement log=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", log);
}
public void sign6()
{
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement signUpLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Signup now']")));
	actions.moveToElement(signUpLink).click().perform();
	signUpLink.click();
	
}

public void Setusername1(String Uname) 
{
	WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", usrname);
	usrname.sendKeys(Uname);
}
public void Setpassword2(String Pssd)
{
	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", password);
	password.sendKeys(Pssd);
	
}
public void checkbox1()
{
	WebElement check=driver.findElement(By.xpath("//label[@for='checkbox']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", check);
	check.click();
	
}
public void login1()
{
	WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", login);
	login.click();
}
public void myp()
{
	WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement myProfileLink = wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='My Profile']")));
	myProfileLink.click();
	WebElement myProfileLink2 = driver.findElement(By.xpath("//a[normalize-space()='My Profile']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myProfileLink2);
	myProfileLink2.click();
	WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement myProfileLink3 = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='My Profile']")));
	myProfileLink3.click();
}
public void edit() throws InterruptedException
{
	Thread.sleep(1000); // 1 seconds
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement editProfileLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Edit Profile']")));
	editProfileLink.click();
	
}
public void clickEditProfile() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increase timeout to 20 seconds
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Edit Profile']")));
    int attempts = 0;
    while (attempts < 2) {
        try {
            WebElement editProfileLink = driver.findElement(By.xpath("//a[normalize-space()='Edit Profile']"));
            editProfileLink.click();
            break;
        } catch (StaleElementReferenceException e) {
            attempts++;
        }
    }}
public void clickEditProfile2() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increase timeout to 20 seconds
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Edit Profile']")));
    WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
    int attempts = 0;
    while (attempts < 2) {
        try {
            WebElement editProfileLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Edit Profile']")));
            editProfileLink.click();
            break;
        } catch (StaleElementReferenceException e) {
            attempts++;
        }
    }
}
public void editname()
{
	WebElement edtnm=driver.findElement(By.xpath("//input[@id='name']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edtnm);
edtnm.clear();
}

public void editname(String ename)
{
	WebElement edtnm=driver.findElement(By.xpath("//input[@id='name']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edtnm);
edtnm.sendKeys(ename);
}
public void editdate()
{
	WebElement edtdd=driver.findElement(By.xpath("//input[@id='date']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edtdd);
edtdd.clear();
}
public void editdob(String edob)
{
	WebElement edate=driver.findElement(By.xpath("//input[@id='date']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edate);
edate.sendKeys(edob);
}
public void editgen()
{
	WebElement egen=driver.findElement(By.xpath("//p[contains(text(),'Male')]//input[1]"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", egen);
egen.click();
}
public void editemailc()
{
	WebElement edmail1=driver.findElement(By.xpath("//input[@id='email_id']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edmail1);
edmail1.clear();
}
public void editemail(String edmail)
{
	WebElement edmail2=driver.findElement(By.xpath("//input[@id='email_id']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edmail2);
edmail2.sendKeys(edmail);
}
public void editephc()
{
	WebElement eph=driver.findElement(By.xpath("//input[@id='phone']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", eph);
eph.clear();
}
public void editephone(String edphone)
{
	WebElement edph=driver.findElement(By.xpath("//input[@id='phone']"));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", edph);
edph.sendKeys(edphone);
}
public void setup() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-gpu");
    options.addArguments("--disable-extensions");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
}

public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
public void home2()
{
	driver.navigate().refresh();
	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element3 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Templates/Designs']s")));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element3);
	element3.click();
}
public void template()
{
	try {
		
	
	} catch (StaleElementReferenceException e) {
	    WebElement element = driver.findElement(By.xpath("//div[normalize-space()='OREON BLUE']"));
	    element.click();
	}
}  
    }




