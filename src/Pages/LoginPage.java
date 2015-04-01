package Pages;

import org.openqa.selenium.WebElement;

import Implement.Implement;

public class LoginPage extends Implement{
	
	public WebElement setLogin(){
		return idElement.setElement("email");
	}
	
	public WebElement setPassword(){
		return idElement.setElement("pass");
	}
	
	public WebElement setSubmit(){
		return idElement.setElement("u_0_l");
	}
	
	
	public MainPage logIn(){
		wartoscWpisz = "fajnyLogin";
		wpisz.operation(setLogin());
		wartoscWpisz = "fajneHaslo";
		wpisz.operation(setPassword());
		kliknij.operation(setSubmit());
		return new MainPage();
	}
}
