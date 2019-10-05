package pages;

import projectBase.ProjectSpecificMethods;

public class LeadPage extends ProjectSpecificMethods {
	
	public CreateLead Clicklead() {
		driver.findElementByLinkText("Leads").click();
		return new CreateLead();
	}
	
}