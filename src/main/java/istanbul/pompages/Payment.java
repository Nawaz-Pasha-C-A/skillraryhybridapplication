package istanbul.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
@FindBy(xpath="//input[@class='btn btn-color events-submit']")
private WebElement paybtn;

public Payment(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void paybutton()
{
	paybtn.click();
}
}
