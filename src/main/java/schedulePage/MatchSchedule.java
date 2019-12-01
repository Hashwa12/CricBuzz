package schedulePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basics.Initialize;

public class MatchSchedule extends Initialize{
	
	@FindBy(xpath = "//a[contains(text(),'Schedule')]")
	WebElement ScheduleButton;
	
	@FindBy(xpath = "//nav[@class='cb-nav-bar']//a[contains(text(),'Teams')]")
	WebElement ScheduleByTeams;
	
	@FindBy(xpath = "//h2//a[contains(text(),'India')]")
	WebElement India;
	
	@FindBy(xpath = "//nav[@class='cb-nav-bar']//a[contains(text(),'Schedule')]")
	WebElement IndiaSchedule;

	public MatchSchedule() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public void Schedule()
	{
		ScheduleButton.click();
	}
	
	public void ByTeam() {
		ScheduleByTeams.click();
	}
	
	public void TeamIndia() {
		India.click();
	}
	
	public void IndiaSchedule() {
		IndiaSchedule.click();
	}

}
