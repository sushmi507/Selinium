package pages;

import projectBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}

	public CrmsfaPage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();		
		return new CrmsfaPage();
	}

}