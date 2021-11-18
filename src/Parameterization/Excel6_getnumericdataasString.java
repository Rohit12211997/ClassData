package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel6_getnumericdataasString 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\shiv\\Desktop\\selenium software\\Book1.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
	System.out.println(value);
}
}
