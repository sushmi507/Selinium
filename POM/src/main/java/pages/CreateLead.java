package pages;

import projectBase.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	public Mylead clickCreatelead()
	{
	driver.findElementByLinkText("Create Lead").click();
	return new Mylead();
}
}