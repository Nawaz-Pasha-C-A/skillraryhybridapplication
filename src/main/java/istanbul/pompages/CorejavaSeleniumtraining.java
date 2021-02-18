package istanbul.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaSeleniumtraining {
  @FindBy(xpath="//div[@class='play-icon']")
  private WebElement playbtn;
  
  @FindBy(xpath="//div[@class='pause-icon']")
  private WebElement pause;
  
  
  @FindBy(xpath="//div[@class='controls enroll_take_course']")
  private WebElement takecoursebtn;
   
  public CorejavaSeleniumtraining(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void playbutton()
  {
	  playbtn.click();
  }
  public void pausebutton() 
  {
	  pause.click();
  }
  public void takecoursebutton()
  {
	  takecoursebtn.click();
  }
}
