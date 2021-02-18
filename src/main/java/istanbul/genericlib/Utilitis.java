package istanbul.genericlib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Nawaz Pasha
 *
 */
public class Utilitis {
	/**
	 * To handle the dropdown elements
	 * @param ele
	 * @param text
	 */
   public void dropDown(WebElement ele,String text)
   {
	   Select s=new Select(ele);
	   s.selectByVisibleText(text);
   }
   /**
    * To handle Mouse Actions
    * @param driver
    * @param ele
    */
   public void mouseActions(WebDriver driver,WebElement ele)
   {
	   Actions a=new Actions(driver);
			   a.moveToElement(ele).perform();
   }
   /**
    * To handle the doubleclick
    * @param driver
    * @param target
    */
   public void doubleClick(WebDriver driver,WebElement target)
   {
	   Actions a=new Actions(driver);
	   a.doubleClick(target).perform();
   }
   /**
    * To handle the scrollbar
    * @param driver
    * @param x
    * @param y
    */
   public void scrollBar(WebDriver driver,int x,int y)
   {
	   JavascriptExecutor j=(JavascriptExecutor)driver;
	   j.executeScript("window.scrollBy("+x+","+y+")");
   }
   /**
    * To handle the Alertpopup
    * @param driver
    */
   public void alertPopup(WebDriver driver)
   {
	   driver.switchTo().alert().accept();
   }
   /**
    * To handle wait elements
    */
   public void elementToclicked(WebDriver driver,WebElement element)
   {
	   WebDriverWait w=new WebDriverWait(driver, 10);
	   w.until(ExpectedConditions.elementToBeClickable(element));
   }
   public void switchingTab(WebDriver driver)
   {
	   Set<String> child = driver.getWindowHandles();
	   for(String b:child)
	   {
		   driver.switchTo().window(b);
	   }
   }
   public void navigateurl(WebDriver driver,String url)
   {
	   driver.navigate().to(url);
   }
   public void frame(WebDriver driver)
   {
	   driver.switchTo().frame(0);
   }
   public void switchbackfromframe(WebDriver driver)
   {
	   driver.switchTo().defaultContent();
   }
}
