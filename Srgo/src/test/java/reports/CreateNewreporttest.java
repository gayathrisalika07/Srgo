package reports;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;
import com.Srgo.pages.ReportWizardpage;
import com.Srgo.pages.Reportspage;
import com.Srgo.pages.Savereportpage;
import com.Srgo.pages.Showingreportspage;

public class CreateNewreporttest extends Basetest 
{
      
	      @Test
	    public void Createnewreport() throws Throwable
	    {
	    	 Loginpage lp= new Loginpage();
	    	 Filelib flib= new Filelib();
	    	 lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	    	 WebDriverComLib wlib= new WebDriverComLib();
	    	 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeTitle"), "Homepage");
	    	 Homepage hp= new Homepage();
	    	 hp.clickreportstb();
	    	 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "Reports"), "reports title");
	    	 Showingreportspage srp= new Showingreportspage();
	    	 srp.createnewreport();
	    	 Reportspage rp= new Reportspage();
	    	 rp.createreport();
	    	 ReportWizardpage rw= new ReportWizardpage();
	    	 rw.fillcolumns();
	    	 Savereportpage sr= new Savereportpage();
	    	 sr.Fillreportname(flib.readPropertyData(PROP_PATH, "reportname"));
	    }
}
