package istanbul.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Nawaz Pasha
 *
 */
public class BaseClass implements AutoConstant {
	public WebDriver driver;
	public Photo p1;
	public Propertyfile p;
	public Exceldata d=new Exceldata();
	public Utilitis u=new Utilitis();
	/**
	 * To open the Application
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
    @BeforeMethod
    public void openApp() throws FileNotFoundException, IOException
    {
    	System.setProperty(key, value);
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	p=new Propertyfile();
    	driver.get(p.getPropertyData("srurl"));
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    /**
     * To close the application and to take photo
     * @param r
     * @throws IOException
     */
    @AfterMethod
    public void closeApp(ITestResult r) throws IOException
    {
    	int status = r.getStatus();
    	String name = r.getName();
    	if(status==2)
    	{
    		p1=new Photo();
    		p1.getPhoto(driver, name);
    	}
    	driver.quit();
    }
}
