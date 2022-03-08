package utils;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelutils {
	/*public static void getrowcount() 
	{
		try {


		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\DIGIVAL SOLUTION\\eclipse-workspace\\DigiScheduler\\excel\\Excel-To-Do-List-Template-Print.xlsx");
		XSSFSheet sheet  = workbook.getSheet("siva");
		int rowcount =sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}*/
	public static void getcelldata()
	{
		try
		{
			XSSFWorkbook workbook1 = new XSSFWorkbook("C:\\Users\\DIGIVAL SOLUTION\\eclipse-workspace\\DigiScheduler\\excel\\Excel-To-Do-List-Template-Print.xlsx");
			XSSFSheet sheet1  = workbook1.getSheet("siva");
			int m =(int) sheet1.getRow(3).getCell(0).getNumericCellValue();
			System.out.println(m);
			int n =workbook1.getNumberOfFonts();
			System.out.println(n);
			List<XSSFName> list1 =workbook1.getAllNames();
			System.out.println(list1);
			int y =workbook1.getFirstVisibleTab();
			System.out.println(y);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getrowcount();
		getcelldata();
	}


}
