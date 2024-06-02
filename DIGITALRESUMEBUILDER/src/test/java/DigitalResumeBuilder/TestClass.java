package DigitalResumeBuilder;

import org.testng.annotations.Test;

import ict.kerala.project.LoginPage;

public class TestClass extends TestBase{
	LoginPage tesobj=null;
@Test (priority=1)
public void poslogin() 
{
	tesobj=new LoginPage(driver);
	tesobj.Setusername("Anamika");
	tesobj.Setpassword("Anamika@123");
	tesobj.checkbox();
	tesobj.login();
	tesobj.logout();
}	
@Test (priority=2)
public void sign()
{
	tesobj=new LoginPage(driver);
	tesobj.signup();
}
@ Test(priority=3)
public void neglogin1() 
{
	tesobj=new LoginPage(driver);
	tesobj.Setusername("Anami");
	tesobj.Setpassword("Anamika@123");
	tesobj.checkbox();
	tesobj.login();
	
}
@Test (priority=4)
public void home1()
{
	tesobj=new LoginPage(driver);
	tesobj.home();
}
@Test (priority=5)
public void sign1()
{
	tesobj=new LoginPage(driver);
	tesobj.signup();
}
@Test(priority=6)
public void neglogin2() 
{
	tesobj=new LoginPage(driver);
	tesobj.Setusername("Anamika");
	tesobj.Setpassword("Anamika@12");
	tesobj.checkbox();
	tesobj.login();
}
@Test (priority=7)
public void home2()
{
	tesobj=new LoginPage(driver);
	tesobj.home();
}
@Test (priority=8)
public void sign2()
{
	tesobj=new LoginPage(driver);
	tesobj.signup();
}

@Test(priority=9)
public void neglogin3() 
{
	tesobj=new LoginPage(driver);
	tesobj.Setusername("");
	tesobj.Setpassword("");
	tesobj.checkbox();
	tesobj.login();
}
@Test(priority=10)
public void forget()
{
	tesobj.forgot();
}
@Test (priority=11)
public void sign3()
{
	tesobj=new LoginPage(driver);
	tesobj.signup();
}
@Test(priority=12)
public void login2() 
{
	tesobj=new LoginPage(driver);
	tesobj.Setusername("Abcd");
	tesobj.Setpassword("Ab@123");
	tesobj.checkbox();
	tesobj.login();
}

@Test(priority=13)
public void profile() 
{
	tesobj=new LoginPage(driver);
	tesobj.Resumebuild();
}

@Test (priority=14)
public void create()
{
	tesobj=new LoginPage(driver);
	tesobj.create();
}
//@Test (priority=15)
//public void usname() 
//{
//	tesobj=new LoginPage(driver);
//	tesobj.usern("Anamika");
//}
@Test (priority=15)
public void dat() 
{
	tesobj=new LoginPage(driver);
	tesobj.dob("01");
}
@Test (priority=16)
public void dat2() 
{
	tesobj=new LoginPage(driver);
	tesobj.dob2("01");
}
@Test (priority=17)
public void dat3() 
{
	tesobj=new LoginPage(driver);
	tesobj.dob3("1995");
}
@Test (priority=18)
public void gend() 
{
	tesobj=new LoginPage(driver);
	tesobj.gender();
}
//public void emai() 
//{
//	tesobj=new LoginPage(driver);
//	tesobj.mail("anamika123@gmail.com");
//}
//public void phone() 
//{
//	tesobj=new LoginPage(driver);
//	tesobj.phone("9856443210");
//}
@Test (priority=19)
public void hschool() throws InterruptedException 
{
	tesobj=new LoginPage(driver);
	tesobj.high();
}

@Test (priority=20)
public void hschool2() 
{
	tesobj=new LoginPage(driver);
	tesobj.high2();
}
@Test (priority=21)
public void hschool3() 
{
	tesobj=new LoginPage(driver);
	tesobj.high3();
}
@Test (priority=22)
public void hschool4() 
{
	tesobj=new LoginPage(driver);
	tesobj.high4();
}
@Test (priority=23)
public void hsper() 
{
	tesobj=new LoginPage(driver);
	tesobj.hiper("100");
}
@Test (priority=24)
public void hsname() 
{
	tesobj=new LoginPage(driver);
	tesobj.hinam("ABC");
}
@Test (priority=25)
public void hsyear() 
{
	tesobj=new LoginPage(driver);
	tesobj.hiyear("2012");
}
@Test (priority=26)
public void logi()
{
	tesobj=new LoginPage (driver);
			tesobj.logout2();
}
@Test(priority=27)
public void si6()
{
	tesobj=new LoginPage (driver);
	tesobj.sign6();
	
}
//@Test(priority=28)
//public void sign4()
//{
//	tesobj=new LoginPage (driver);
//	tesobj.signup();
//}
@Test (priority=28)
public void prof()
{
	tesobj=new LoginPage(driver);
	tesobj.Setusername1("Anamika");
	tesobj.Setpassword2("Anamika@123");
	tesobj.checkbox();
	tesobj.login1();
}
@Test (priority=29)
public void mprof()
{
	tesobj=new LoginPage(driver);
	tesobj.myp();
}
@Test (priority=30)
public void edtp() throws InterruptedException
{
	tesobj=new LoginPage(driver);
	tesobj.edit();
}
@Test (priority=31)
public void edtn()
{
	tesobj=new LoginPage(driver);
	tesobj.editname();
}
@Test (priority=32)
public void edto()
{

	tesobj.editname("Diya");
	tesobj.editdob("28-12-1996");
	tesobj.editgen();
	tesobj.editemailc();
	tesobj.editemail("diyabmct@gmail.com");
	tesobj.editephc();
	tesobj.editephone("7736374845");
	
}
@Test (priority=33)
public void templ()
{
tesobj.template();
tesobj.setup();
tesobj.home2();
}


}	




