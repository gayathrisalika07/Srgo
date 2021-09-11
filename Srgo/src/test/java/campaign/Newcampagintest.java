package campaign;

import org.testng.annotations.Test;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.pages.Createcampaignpage;
import com.Srgo.pages.Displayingcustomviewdetailspage;
import com.Srgo.pages.Homepage;
import com.Srgo.pages.Loginpage;

public class Newcampagintest extends Basetest
{
	    @Test
      public void newcampagin() throws Throwable
      {
    	    Loginpage lp= new Loginpage();
    	    Filelib flib = new Filelib();
    	    lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
    	    Homepage hp = new Homepage();
    	    hp.campaignstab();
    	    Displayingcustomviewdetailspage dcp= new Displayingcustomviewdetailspage();
    	    dcp.newcampaign();
    	    Createcampaignpage ccp= new Createcampaignpage();
    	    ccp.newcampagin("banner");
      }
}
