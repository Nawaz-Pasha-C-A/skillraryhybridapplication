package istanbul.Testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import istanbul.genericlib.BaseClass;
import istanbul.pompages.CorejavaSeleniumtraining;
import istanbul.pompages.Payment;
import istanbul.pompages.Selenium;
import istanbul.pompages.Skillrary;

public class PayAmount extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException
	{
   Skillrary s=new Skillrary(driver);
   s.searchtb(p.getPropertyData("search"));
   s.go();
   
   Selenium s1=new Selenium(driver);
   s1.corejavabutton();
  
   CorejavaSeleniumtraining cs=new CorejavaSeleniumtraining(driver);
  // u.frame(driver);
  // Thread.sleep(3000);
   //cs.playbutton();
  // Thread.sleep(3000);
  // cs.pausebutton();
   //u.switchbackfromframe(driver);
  // Thread.sleep(3000);

            cs.takecoursebutton();
  // Payment p2=new Payment(driver);
  // {
	//   p2.paybutton();
  // }
   
	}
}
