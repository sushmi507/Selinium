package pages;

import projectBase.ProjectSpecificMethods;

public class CrmsfaPage extends ProjectSpecificMethods {
	
	public LeadPage clickcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadPage();
	}
	
}