package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invalid {
	WebDriver driver;

	public Invalid(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter the train name or number']") WebElement TrainNUM;
	@FindBy(xpath="(//button[contains(@class,'c-btn u-link')]//div)[3]") WebElement SearchNumber;
	
	public void TNUM() {
		TrainNUM.click();
		TrainNUM.sendKeys("12805");
	}
	public void Search5() {
		SearchNumber.click();
	}
}

