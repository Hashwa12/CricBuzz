package scorePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basics.Initialize;

public class LiveScore extends Initialize {

	@FindBy(xpath = "(//a[@class='cb-hm-mnu-itm'])[1]")
	WebElement Livescore;

	@FindBy(xpath = "(//a[@class='cb-mat-mnu-itm cb-ovr-flo'])[1]")
	WebElement Matches;

	@FindBy(xpath = "//a[contains(text(),'Scorecard')]")
	WebElement Scorecard;
	
	@FindBy(xpath = "//h1")
	WebElement Country;
	
	@FindBy(xpath = "(//div[@class='cb-nav-subhdr cb-font-12']/a)[1]")
	WebElement series;
	
//	@FindBy(xpath = )
	public LiveScore() throws Exception {
		PageFactory.initElements(driver, this);
	}

	public void LIVESCORE() {
		System.out.println("LIVESCORE");
		Livescore.click();
	}

	public void CurrentMatches() {
		Matches.click();
	}
	
	public void scorecard()
	{
		Scorecard.click();
	}
	
	public String CountryName() {
		String countryname = Country.getText();
		return countryname;
	}
	
	public String Series() {
		String SeriesName = series.getText();
		return SeriesName;
	}

}
