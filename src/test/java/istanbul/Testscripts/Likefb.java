package istanbul.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import istanbul.genericlib.BaseClass;
import istanbul.pompages.Facebook;
import istanbul.pompages.Login;
import istanbul.pompages.Skillrary;
import istanbul.pompages.Testing;

public class Likefb extends BaseClass{
   @Test
   public void tc2() throws EncryptedDocumentException, InvalidFormatException, IOException
   {
	   Skillrary s=new Skillrary(driver);
	   s.gearButton();
	   s.skillrarydemoapptab();
	   
	   u.switchingTab(driver);
	   
	   Login l=new Login(driver);
	   u.dropDown(l.getCourseadd(),p.getPropertyData("data"));
	   
	   Testing t=new Testing(driver);
	   t.facebookbutton();
	   
	   Facebook f=new Facebook(driver);
	   f.likebtn();
   }
}
