package pages;

import projectBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}

}