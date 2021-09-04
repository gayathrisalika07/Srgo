package home;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;



public class Modluedd extends Basetest
{
	 @Test
	public void moduledd() throws Throwable
	{
		Loginpage lp= new Loginpage();
		Filelib flib= new Filelib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		WebDriverComLib wlib= new WebDriverComLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeTitle"), "homepage");
		Homepage hp = new Homepage();
		hp.newdd();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "invoiceTitle"), "invoice");
		 
		 
		 
		 
		 
	}
	

}
