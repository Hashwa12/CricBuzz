package mainFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static File file;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static Row row;
	int rownum = 1;
	


	public ExcelWrite() throws IOException
	{
		file = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\CricBuzz\\ScoreBoard.xlsx");
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);	}
	
//	@SuppressWarnings("deprecation")
	public void newrow(String [] n) throws IOException {
		row=sheet.createRow(rownum++);
		for (int i = 0; i < n.length; i++) {
			row.createCell(i).setCellValue(n[i]);
		}
//		XSSFCellStyle style1 = workbook.createCellStyle();
//		style1.setFillBackgroundColor(new XSSFColor(new java.awt.Color(128, 0, 128)));
//		style1.setFillPattern(c);
		
		fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
	}
}
