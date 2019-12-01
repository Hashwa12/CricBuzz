package mainFiles;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.Initialize;

public class ScheduleScript extends Initialize{
	public ExcelWriteMatchSchedule excel_MS = new ExcelWriteMatchSchedule();
	String ScheduleTitle [];
//	String Schedule [] = new String[6];
	
	public ScheduleScript() throws Exception
	{
		super();
	}
	
	public void MatchSchedule() throws IOException {
		
		List<WebElement> rowList = driver.findElements(By.xpath("//div[@class='cb-lv-grn-strip text-bold']/parent::*"));
		int size = rowList.size();
		
		for (int i = 1; i <= 2; i++)
		{
			String MatchDay = driver.findElement(By.xpath("(//div[@class='cb-lv-grn-strip text-bold']/parent::*)["+i+"]/div[1]")).getText();
			if(!MatchDay.substring(0,3).equals("SAT"))
			{
				List<WebElement> MatchesInDay = driver.findElements(By.xpath("(//div[@class='cb-lv-grn-strip text-bold']/parent::*)["+i+"]/div"));
				int SubElements = MatchesInDay.size();
				
				for (int a = 2; a <= SubElements; a++)
				{
					String MatchTitle = driver.findElement(By.xpath("(//div[@class='cb-lv-grn-strip text-bold']/parent::*)["+i+"]/div["+a+"]/div[1]")).getText();
					System.out.println(MatchTitle);
					
					List<WebElement> col2 = driver.findElements(By.xpath("(//div[@class='cb-lv-grn-strip text-bold']/parent::*)["+i+"]/div["+a+"]/div[2]/div/*"));
					System.out.println(col2.size());
					
					for (int b = 1; b <= col2.size(); b++)
					{
						String ele = driver.findElement(By.xpath("((//div[@class='cb-lv-grn-strip text-bold']/parent::*)["+i+"]/div["+a+"]/div[2]/div/*)["+b+"]")).getText();
						System.out.print(ele+"\t");
					}
				}
			}
		}		
	}	
}
