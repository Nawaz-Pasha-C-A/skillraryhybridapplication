package istanbul.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Nawaz Pasha
 *
 */
public class Propertyfile implements AutoConstant{
	/**
	 * To handle propertyfile
	 * @param keyvalue
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
    public String getPropertyData(String keyvalue) throws FileNotFoundException, IOException
    {
    	Properties p=new Properties();
    	p.load(new FileInputStream(propertyfilepath));
    	return p.getProperty(keyvalue);
    }
}
