package Week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException 
	{
		// Step1 : Set excel path 
		XSSFWorkbook wb=new XSSFWorkbook("./src/test/resources/Book.xlsx");
		
		// Step2 : Get the sheet
		XSSFSheet sheet=wb.getSheetAt(0);

		//Step3 : Get to the row
		XSSFRow row=sheet.getRow(0);
		int rowValue=sheet.getLastRowNum();
		System.out.println("The row values are without header " + rowValue);
		int phy=sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows are " + phy);
		
		//Step4 : Get to the cell
		XSSFCell cell=row.getCell(1);
		int cell1=row.getPhysicalNumberOfCells();
		System.out.println("Physical cell count is " + cell1);
		String value=sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(" cell value is  " + value);
		
		for (int i=1 ;i<=rowValue;i++)
		{
			for(int j=0;j<cell1;j++)
			{
				String s=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(s);
			}
		}
		
	}

}
