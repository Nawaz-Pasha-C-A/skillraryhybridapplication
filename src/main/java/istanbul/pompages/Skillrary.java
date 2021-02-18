package istanbul.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
   @FindBy(xpath=" //a[text()=' GEARS ']")
   private WebElement gearsbtn;
   
   @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
   private WebElement skillrarydemoapp;
   
   public Skillrary(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void gearButton()
   {
	   gearsbtn.click();
   }
   public void skillrarydemoapptab()
   {
	   skillrarydemoapp.click();
   }
   @FindBy(name="q")
   private WebElement searchtab;
   @FindBy(xpath="//input[@value='go']")
   private WebElement gobtn;
   
   public void searchtb(String coursename)
   {
	   searchtab.sendKeys(coursename);
   }
   
   public void go()
   {
	   gobtn.click();
   }
}
