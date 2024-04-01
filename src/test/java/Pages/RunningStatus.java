package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RunningStatus {
	WebDriver driver;

	public RunningStatus(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[contains(@class,'nav-list-item u-ib')])[2]") WebElement Status;
	@FindBy(xpath="(//input[@placeholder='Enter the train name or number'])[2]") WebElement TrainNum;
	@FindBy(xpath="(//div[text()='BDTS/Bandra Terminus to BJU/Barauni Jn'])[2]") WebElement Number;
	@FindBy(xpath="//div[@id='content']/div[1]/div[1]/div[3]/div[5]/div[2]/div[2]/button[1]/div[1]") WebElement Searchclick;
	@FindBy(xpath="//div[contains(text(),'Tomorrow')]//ancestor::div[@class='date-item u-ib ']") WebElement Tmrw;
	
	public void TrainStatus() {
		Status.click();
	}
	public void TNumber() {
		TrainNum.click();
	}
	public void Number1() {
		Number.click();
	}
	public void Search3() {
		Searchclick.click();
	}
	public void tmrw() {
		Tmrw.click();
	}

}
