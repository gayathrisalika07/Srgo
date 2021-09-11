package cases;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.CreateTaskpage;
import com.Srgo.pages.Displayingcustomviewdetailspage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;
import com.Srgo.pages.subjectnamelookuppage;

public class Createtasktest extends Basetest
{
	     @Test
       public void createtask() throws Throwable
       {
    	 Loginpage lp= new Loginpage();
    	 Filelib flib= new Filelib();
    	 lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
    	 WebDriverComLib wlib= new WebDriverComLib();
    	 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeTitle"), "homepage");
    	 Homepage hp= new Homepage();
    	 hp.casestab();
    	 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "CustomViewTitle"), "customviewdetails");
    	  Displayingcustomviewdetailspage  cdp= new Displayingcustomviewdetailspage();
    	  cdp.Createnewtask();
    	  wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "CreatetaskTitle") , "createtaskpage");
    	  CreateTaskpage ctp= new CreateTaskpage();
    	  subjectnamelookuppage snlp= new subjectnamelookuppage();
    	  ctp.newtask();
    	  snlp.selectsubject();
    	       
       }
       
}
