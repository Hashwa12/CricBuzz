package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import basics.Initialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mainFiles.ScheduleScript;
import schedulePage.MatchSchedule;
import scorePages.LiveScore;

public class ScheduleWrite extends Initialize{
	
	MatchSchedule ms;
	ScheduleScript ss;
	
	public ScheduleWrite() throws Exception {
		super();
	}

	@Given("^User entered in to home page$")
	public void User_in_to_HomePage() throws Exception
	{
		initialize();
	}

	@Then("^User clicks Schedule button$")
	public void user_clicks_Schedule_button() throws Throwable {
		ms = new MatchSchedule();
		ms.Schedule();
	}

	@Then("^User is in match schedule page$")
	public void user_is_in_match_schedule_page() throws Throwable {
		
		Actions action = new Actions(driver);
		for (int i = 0; i < 7; i++) {
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(250);
		}
	}

	@Then("^User write schedule in excel$")
	public void user_write_schedule_in_excel() throws Throwable {
		ss = new ScheduleScript();
		ss.MatchSchedule();
	}
	
	@Then("^Exit the browser$")
	public void Exit_Browser()
	{
		driver.quit();
	}
}
