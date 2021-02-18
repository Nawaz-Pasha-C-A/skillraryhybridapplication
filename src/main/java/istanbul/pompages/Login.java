package istanbul.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(id="course")
private WebElement coursetab;

public WebElement getCoursetab() {
	return coursetab;
}
@FindBy(xpath="//a[text()='Selenium Training']")
private WebElement Seleniumtraining;

@FindBy(name="addresstype")
private WebElement courseadd;

public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void seleniumtrainingbtn()
{
	Seleniumtraining.click();
}
public WebElement getCourseadd() {
	return courseadd;
}



}
