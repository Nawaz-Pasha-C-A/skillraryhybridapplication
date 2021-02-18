package istanbul.genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Nawaz Pasha
 *
 */
public class Exceldata implements AutoConstant{
	/**
	 * To handle excel data
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
     public String getExceldata(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
     {
    	 FileInputStream f=new FileInputStream(excelpath);
    	Workbook wb = WorkbookFactory.create(f);
    	return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
     }
}
