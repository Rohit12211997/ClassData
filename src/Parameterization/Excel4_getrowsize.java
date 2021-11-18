package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel4_getrowsize
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\shiv\\Desktop\\selenium software\\Book1.xlsx");
	
	int lastrowindex = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println(lastrowindex);
	
	int rowSize= lastrowindex+ 1;
	System.out.println(rowSize);
}
}
 