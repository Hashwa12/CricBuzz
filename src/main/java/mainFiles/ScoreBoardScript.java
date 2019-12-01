package mainFiles;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.Initialize;

public class ScoreBoardScript extends Initialize{
	public ExcelWrite EW = new ExcelWrite();
	String battingCells[];
	public ScoreBoardScript() throws Exception
	{
		super();
	}
	public void Score() throws IOException
	{
		List<WebElement> innings = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-bg-white']//div[@class='ng-scope']"));
		int Tot_Innings = innings.size();
		
		String str = driver.findElement(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[@class='ng-scope'][1]")).getAttribute("id");
//		String val = str.substring(9);
		int val = Integer.parseInt(str.substring(8));
		if (val==2)
		{	
		for(int i=Tot_Innings;i>0;i--)
		{
			for(int j=1;j<=2;j++)
			{
				List<WebElement> cellrow = driver.findElements(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div"));
				if(j==1)
				{
					for (int k = 2; k < cellrow.size(); k++) {
						if(k==cellrow.size()-1||k==cellrow.size()-2)
						{
							battingCells = new String[3];
							for(int l=1;l<4;l++)
							{
							 	battingCells[l-1]= driver.findElement(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div["+k+"]/div["+l+"]")).getText();
							}
							EW.newrow(battingCells);
						}
						else {
							battingCells = new String[7];
							for(int l=1;l<8;l++)
							{
								battingCells[l-1] = driver.findElement(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div["+k+"]/div["+l+"]")).getText();
							}
							EW.newrow(battingCells);
						}
					}
				}
				else {
					battingCells = new String[8];	
					for (int k = 1; k < cellrow.size(); k++) {
						for(int l=1;l<9;l++)
							{
								battingCells[l-1] = driver.findElement(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div["+k+"]/div["+l+"]")).getText();
							}
							EW.newrow(battingCells);
					}
				}
			}			
		}
		}
		else {
			for(int i=1;i<=Tot_Innings;i++)
			{
				for(int j=1;j<=2;j++)
				{
					List<WebElement> cellrow = driver.findElements(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div"));
					if(j==1)
					{
						for (int k = 2; k < cellrow.size(); k++) {
							if(k==cellrow.size()-1||k==cellrow.size()-2)
							{
								battingCells = new String[3];
								for(int l=1;l<4;l++)
								{
								 	battingCells[l-1]= driver.findElement(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div["+k+"]/div["+l+"]")).getText();
								}
								EW.newrow(battingCells);
							}
							else {
								battingCells = new String[7];
								for(int l=1;l<8;l++)
								{
									battingCells[l-1] = driver.findElement(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div["+k+"]/div["+l+"]")).getText();
								}
								EW.newrow(battingCells);
							}
						}
					}
					else {
						battingCells = new String[8];	
						for (int k = 1; k < cellrow.size(); k++) {
							for(int l=1;l<9;l++)
								{
									battingCells[l-1] = driver.findElement(By.xpath("(//div[@id='innings_"+i+"']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])["+j+"]/div["+k+"]/div["+l+"]")).getText();
								}
								EW.newrow(battingCells);
						}
					}
				}			
			}
		
		}
	}
}
