package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="createlead";
	}
	
	@Test(dataProvider="fetchData")
	public void loginTestcase(String userName, String pass,String fname,String lname,String cname) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		//crmsfa
		.clickcrmsfa()
		//lead
		.Clicklead()
		//create lead
		.clickCreatelead()
		//frstnam
		.enter_first_name(fname)
		//lastname
        .enter_last_name(lname)
		//companyname
        .enter_company_name(cname)
        //submit
        .submit();
		//

	}

}
