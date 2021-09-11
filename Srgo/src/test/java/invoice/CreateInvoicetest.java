
package invoice;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;
import com.Srgo.pages.CreateInvoicepage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class CreateInvoicetest extends Basetest
{
	   @Test
      public  void CreateInvoice() throws Throwable 
      {
    	  
    	  Loginpage lp= new Loginpage();
    	  Filelib flib= new Filelib();
    	  lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
    	  WebDriverComLib wlib= new WebDriverComLib();
    	  wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH,"HomeTitle"), "homepage");
    	  Homepage hp= new Homepage();
    	  hp.newdd();
    	  wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "InvoiceTitle"),"invoice page");
                 CreateInvoicepage ci=new CreateInvoicepage();
                 Thread.sleep(3000);
                 ci.FillMandatorydetails(flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0), flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 1), flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 2), "3", "30000");
    	  
    	  
    	  
    	  
    	 
    	  
    	  
    	  
      }
	
	
	
}
