package istanbul.Testscripts;

import org.testng.annotations.Test;

import istanbul.genericlib.BaseClass;
import istanbul.pompages.Addtocart;
import istanbul.pompages.Login;

public class Addingtocart extends BaseClass{
	@Test
  public void tc1()
  {
	Login l=new Login(driver);
	u.mouseActions(driver, l.getCoursetab());
	l.seleniumtrainingbtn();
	Addtocart a=new Addtocart(driver);
	u.doubleClick(driver, a.getAddbtn());
	a.addtoCartbutton();
	u.alertPopup(driver);
	a.cartBtn();
	a.gotocartbtn();
	
  }
}
