package Testy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class NewTest {

	LoginPage page;

	
	@BeforeTest
	public void before() {
		page = new LoginPage();
	}

	@Test
	public void testLogin() {
		page.logIn();
	}
	
	@AfterTest
	public void after(){
		page.closeDriver();
	}
}
