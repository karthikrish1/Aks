package FILEHAND;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class read {
	
	@Test
	public void ab() throws IOException
	{
		//apache poi, apache poi ooxml, poi ooxml schema
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
	    XSSFSheet sheet = x.getSheetAt(0);
	    
	    // number of rows:
	    int row=sheet.getLastRowNum();
	    System.out.println("Number of rws "+ row);
	    //number of columns: specific about row index
	    //row1
	    int col=sheet.getRow(1).getLastCellNum();
	    System.out.println("Number of columns in row 1 is "+ col);
	    
	    // reading
	    // know the row index and column index
	    XSSFCell data = sheet.getRow(5).getCell(2);
	    System.out.println(data);
	    
	    //9,5
	    sheet.getRow(9).createCell(5).setCellValue("hi");
	    FileOutputStream fos= new FileOutputStream(f);
	    x.write(fos);
	}

}
