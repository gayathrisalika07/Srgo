package forecasts;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;
import com.Srgo.pages.Taskpage;


public class Newtaskwithmanadatorytest extends Basetest {

	public static void main(String[] args) throws Throwable  {
		
             Basetest bt= new Basetest();
             bt.openBrowser();
             Loginpage lp= new Loginpage();
             Filelib flib= new Filelib();
             lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
             WebDriverComLib wlib= new WebDriverComLib();
            // Filelib flib= new Filelib();
            // wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "HomeTitle") , "homepage");
             Homepage hp=new Homepage();
             hp.newtak();
             wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, " CreatetaskTitle"), "createtaskpage");
             Taskpage ct= new Taskpage();
             ct.Createtaskwithmandatoy(flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0));
	}

}
