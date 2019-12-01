package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.Initialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mainFiles.ScoreBoardScript;
import scorePages.LiveScore;

public class HomePageStepDefinition extends Initialize{
	
	LiveScore L_Score;
	public static Properties prop;
	
	ScoreBoardScript S;
	
	public HomePageStepDefinition() throws Exception {
		super();
	}
	
	
	
	@Given("^User is entered in to home page$")
	public void User_in_HomePage() throws Exception
	{
		initialize();
		
		L_Score = new LiveScore();
	
	}

	@Then("^User clicks Live Scores button$")
	public void User_Clicks_LiveScore_Button()
	{
		L_Score.LIVESCORE();
		L_Score.CurrentMatches();
	}

	@Then("^User is in first Live match page$")
	public void User_in_First_LiveMatch_Page()
	{
		L_Score.scorecard();
	}
	
	@Then("^User select the match title$")
	public void User_Select_Match_title()
	{
		String Countries = L_Score.CountryName();
		String Series =	L_Score.Series();
		System.out.println(Countries+"\n"+Series);
	}
	
	@Then("^User get the First Innings Score$")
	public void User_Get_First_Innings_Score() throws Exception
	{
		S = new ScoreBoardScript();
		S.Score();
	}
	
	@Then("^Exiting the browser$")
	public void Exiting_Browser()
	{
		driver.quit();
	}
		
}
