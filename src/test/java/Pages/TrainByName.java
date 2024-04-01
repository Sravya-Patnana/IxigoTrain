package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainByName {
WebDriver driver;

	public TrainByName(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Search By Name/Number']") WebElement TrainName;
	@FindBy(xpath="//input[@placeholder='Enter the train name or number']") WebElement TName;
	@FindBy(xpath="(//div[@data-acindex='0']//div)[2]") WebElement Name1;
	@FindBy(xpath="//div[@id='content']/div[1]/div[1]/div[3]/div[3]/div[2]/div[2]/button[1]/div[1]") WebElement SearchClick;
	
	public void TN() {
		TrainName.click();
	}
	public void Name() {
		TName.click();
	}
	public void NameClick() {
		Name1.click();
	}
	public void Search2() {
		SearchClick.click();
	}

}
