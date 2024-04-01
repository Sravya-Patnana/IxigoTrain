package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByStation {
	WebDriver driver;

	public ByStation(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Search By Station']") WebElement Station;
	@FindBy(xpath="//input[@placeholder='Enter the station name or code']") WebElement Sname;
	@FindBy(xpath="//div[@id='stationSearchForm']/div[2]/div[2]/button[1]/div[1]") WebElement SearchStation;
	
	 public void ByStationName() {
		 Station.click();
	 }
	 public void StationName() {
		 Sname.click();
		 Sname.sendKeys("New Delhi (NDLS)");
		 Sname.sendKeys(Keys.RETURN);
	 }
	 public void Search4() {
		 SearchStation.click();
	 }
}
