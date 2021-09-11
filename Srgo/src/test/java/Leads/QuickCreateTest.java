package Leads;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.CreateLeadPage;
import com.Srgo.pages.CustomViewPage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class QuickCreateTest extends Basetest {

	@Test
	public void QuickCreateLeadTest() throws Throwable
	{ 
	 //Basetest bt = new Basetest();
	  // bt.openBrowser();
	 Loginpage lp= new Loginpage();
	 Filelib flib =new Filelib();
	 lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	 WebDriverComLib wlib =new WebDriverComLib();
      wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "HomeTitle");
      Homepage hp= new Homepage();
      hp.clickLeadsTab();
      wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "Customviewpage"), "custom view page");
      CustomViewPage cv= new CustomViewPage();
      cv.clickNewLeadBtn();
      CreateLeadPage qcl=new CreateLeadPage();
      qcl.CreateLeadWithMandatoryDetails(flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 1), flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0));
      wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "CustomViewTitle"), "customviewpage");
     
		
	}

	}


