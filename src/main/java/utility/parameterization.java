package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {
	public static String getData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\program\\Facebook\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
	   String value=WorkbookFactory.create(file).getSheet("").getRow(row).getCell(cell).getStringCellValue();
	   return value;
}
}
