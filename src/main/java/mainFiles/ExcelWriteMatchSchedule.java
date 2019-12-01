package mainFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteMatchSchedule {

	public static File file;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static Row row;
	int rownum =0;
	int datanum = 1;


	public ExcelWriteMatchSchedule() throws IOException
	{
		file = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\CricBuzz\\Schedule.xlsx");
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(1);
	}
	
	public void nextrow(String [] n) throws IOException {
		row=sheet.createRow(rownum++);
		for (int i = 0; i < n.length; i++) {
			row.createCell(i).setCellValue(n[i]);
		}
	}
	
	
	public void nextrow(String date, String country, String tour, String stadium, String IST, String GMT) throws IOException {
			
		for (int i = 1,j=0; i < 3; i++) {
			row=sheet.createRow(i);
			row.createCell(j).setCellValue(date);
			row.createCell(j+1).setCellValue(country);
			row.createCell(j+2).setCellValue(IST);
		}
		
		
		
		
		
		
		
		fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
	}
}
