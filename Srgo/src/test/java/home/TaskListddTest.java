package home;

import com.Srgo.GenericLib.*;

import com.Srgo.GenericLib.Filelib;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class TaskListddTest extends Basetest
{
	public static void main(String [] args) throws Throwable
	{
	     Basetest bt	=new Basetest();
		bt.openBrowser();
		Loginpage lp=new Loginpage();
		Filelib flib= new Filelib();
		//lp.loginToApp(flib.ReadPropertyData(PROP_PATH, "username"), flib.ReadPropertyData(PROP_PATH, "password"));
		 lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	     WebDriverComLib wlib=new WebDriverComLib();
	     wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "HomeLoginTitle"), "Homepage");
		Homepage hp = new Homepage();
		hp.tasklistdd();
		
		
		
		
		
	}
		
	
	
}
