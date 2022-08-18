import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xcel_data {

	public static void main(String[] args) throws Exception {

		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook();
		String Data1=wb.getSheet(path).getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data1);
	}

} 
