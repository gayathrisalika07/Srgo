package forecasts;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.Createforecastepage;
import com.Srgo.pages.Forecastepage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class Newforecast  extends Basetest {
        @Test
	public void forecast() throws Throwable
	{
		//Basetest bt= new Basetest();
		//bt.openBrowser();
		Filelib flib= new Filelib();
		Loginpage lp= new Loginpage();
		Thread.sleep(3000);
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		WebDriverComLib wlib= new WebDriverComLib();
		//Filelib flib= new Filelib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeTitle"), "Homepage");
		Homepage hp= new Homepage();
		hp.newforecaste();
		Thread.sleep(3000);
	     wlib.verify(PROP_PATH, flib.readPropertyData(PROP_PATH, "Createforecast"), "forecastpage");
		Createforecastepage cfp= new Createforecastepage();
		cfp.Fillrequiredfileds(6, 2);
		//wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "ForecastTitle"), "forecastpage");
		   Forecastepage fcp= new Forecastepage();
		   fcp.FillDetails();
		
		
		
		
	}

}
