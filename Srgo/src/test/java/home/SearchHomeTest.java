package home;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;


public class SearchHomeTest extends Basetest {
	
	@Test
	public void searchTest() throws Throwable
	{
	     
	     Filelib flib= new  Filelib();
	     Loginpage lp =new Loginpage();
	     lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	     WebDriverComLib wlib =new WebDriverComLib();
	     wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeLoginTitle"), "homepage");
	     Homepage h= new Homepage();
	     h.search("Qspiders");
	     wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "CustomViewTitle"), "Custom view page should be displayed");
	     
	}
     
     
	}    


