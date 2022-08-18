package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xl1 {

	public static void main(String[] args) throws Exception {


		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data_00=wb.getSheet(path).getRow(0).getCell(0).getStringCellValue();
		System.out.println(data_00);
		
	}

}
