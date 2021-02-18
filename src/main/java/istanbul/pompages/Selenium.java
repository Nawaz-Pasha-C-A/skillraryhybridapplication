package istanbul.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium {
  @FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
  private WebElement corejavatab;
  
  public Selenium(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void corejavabutton() 
  {
	  corejavatab.click();
  }
}
