package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainSearch {
	WebDriver driver;

	
	public TrainSearch(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//p[@class='body-sm text-xl'])[3]") WebElement TrainClick;
	@FindBy(xpath="//input[@class='c-input u-v-align-middle']") WebElement Leaving;
	@FindBy(xpath="//div[text()='Secunderabad Jn (SC)']") WebElement LFClick;
	@FindBy(xpath="//input[@placeholder='Going to']") WebElement GoingTo;
	@FindBy(xpath="(//div[@data-acindex='0'])[2]") WebElement GoingClick;
	@FindBy(xpath="//div[@class='u-ripple']") WebElement SearchBar;
	
	public void Train() {
		TrainClick.click();
	}
	public void LeaveF(String s) {
		Leaving.sendKeys(s);
		Leaving.sendKeys(Keys.RETURN);
	}
	public void LFC() {
		LFClick.click();
	}
	public void GTo() {
		GoingTo.click();
		GoingTo.sendKeys("New Delhi (NDLS)");
	}
	public void Gclick() {
		GoingClick.click();
	}
	public void Search1() {
		SearchBar.click();
	}
	
	
	
	

}
