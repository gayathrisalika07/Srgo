package purchaseorders;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.Displayingcustomviewdetailspage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class Createviewtest extends Basetest
{
	@Test
  public void createview() throws Throwable
  {
		Loginpage lp= new Loginpage();
		Filelib flib= new Filelib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		WebDriverComLib wlib= new WebDriverComLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeTitle"), "Homepage");
		Homepage hp= new Homepage();
		hp.purchaseclick();
		Displayingcustomviewdetailspage cv= new Displayingcustomviewdetailspage();
		cv.Createnewview(flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0), 6);
	  
  }
}
