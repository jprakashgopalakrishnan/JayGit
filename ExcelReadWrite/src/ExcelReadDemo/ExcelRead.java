package ExcelReadDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\Jay\\Desktop\\Jay.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int row = sheet1.getLastRowNum();
		System.out.println("Row Value:"+row);
		for(int i=0;i<row;i++)
		{
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();	
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();	
			System.out.println(data);
			System.out.println(data1);

		}
		
		
	}

}
