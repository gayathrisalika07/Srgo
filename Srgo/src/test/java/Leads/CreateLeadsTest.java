package Leads;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.CreateLeadPage;
import com.Srgo.pages.CustomViewPage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class CreateLeadsTest extends Basetest {

	
      @Test
	public void CreateLeads() throws Throwable
	{
		//Basetest bt= new Basetest();
		//bt.openBrowser();
		Loginpage lp= new Loginpage();
		Filelib flib=new Filelib();
		
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData( PROP_PATH, "password"));
		WebDriverComLib wlib = new WebDriverComLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Homepage");
		Homepage hp= new Homepage();
		hp.clickLeadsTab();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"), "Custom view page");
		CustomViewPage cv =new CustomViewPage();
		cv.clickNewLeadBtn();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createLeadTitle"), "Create Lead Page");
		CreateLeadPage cl =new CreateLeadPage();
		cl.CreateLeadWithMandatoryDetails(flib.readExcelData(EXCEL_PATH, "Leads", 0, 1), flib.readExcelData(EXCEL_PATH, "Leads", 1, 1));
		
		wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "leadDetailsTitle"), "Lead Details page");
		
		

	}

}
