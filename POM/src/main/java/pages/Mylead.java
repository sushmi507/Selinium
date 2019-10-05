package pages;

import projectBase.ProjectSpecificMethods;

public class Mylead extends ProjectSpecificMethods {

	public Mylead enter_first_name(String first) {
		driver.findElementByName("lastName").sendKeys(first);
		return this ;
	}

	public Mylead enter_last_name(String last) {
		driver.findElementByName("firstName").sendKeys(last);
		return this;
	}


	public Mylead enter_company_name(String company) {
		driver.findElementByName("companyName").sendKeys(company);
		return this;
	}
	
	public ViewLead submit() {
		driver.findElementByName("submitButton").click();
		return new ViewLead() ;
	}
	
}