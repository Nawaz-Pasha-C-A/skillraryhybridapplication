package istanbul.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addbtn;
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement cart;
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement gotocart;
	public Addtocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtoCartbutton()
	{
		addtocartbtn.click();
	}
	public void cartBtn()
	{
		cart.click();
	}
	public void gotocartbtn()
	{
		gotocart.click();
	}
}
