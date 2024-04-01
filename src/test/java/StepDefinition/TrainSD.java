package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.ByStation;
import Pages.Invalid;
import Pages.RunningStatus;
import Pages.TrainByName;
import Pages.TrainSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainSD {
	WebDriver driver = new ChromeDriver();
	TrainSearch tr = new TrainSearch(driver);
	//Scenario 1
	@Given("I am on the Home Page of Ixigo app")
	public void i_am_on_the_home_page_of_ixigo_app() {
	    
		driver.manage().window().maximize();
        driver.get("https://www.ixigo.com/");
	}

	@When("I click on Trains and I can see the trains page")
	public void i_click_on_trains_and_i_can_see_the_trains_page() {
	    
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		 WebElement train = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//p[@class='body-sm text-xl'])[3]"))));
//	     train.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 tr.Train();
		 
		 
	}

	@When("I Enter {string} in From bar")
	public void i_enter_in_from_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement LF = driver.findElement(By.xpath("//input[@class='c-input u-v-align-middle']"));
//        LF.sendKeys("Secunderabad Jn (SC)");
		tr.LeaveF("Secunderabad Jn (SC)");
//        LF.sendKeys(Keys.RETURN);
//        WebElement cl = driver.findElement(By.xpath("//div[text()='Secunderabad Jn (SC)']"));
//        cl.click();
		tr.LFC();
	}

	@When("I Enter {string} in To bar")
	public void i_enter_in_to_bar(String string) throws InterruptedException {
	    
//		WebElement To = driver.findElement(By.xpath("//input[@placeholder='Going to']"));
//    	To.click();
//        To.sendKeys("New Delhi (NDLS)");
		tr.GTo();
//        WebElement Clk = driver.findElement(By.xpath("(//div[@data-acindex='0'])[2]"));
//        Clk.click();
		tr.Gclick();
	}

	@When("I click on Search bar")
	public void i_click_on_search_bar() {
	    
//		 WebElement Search = driver.findElement(By.xpath("//div[@class='u-ripple']"));
//		 Search.click();
		tr.Search1();
		 
	}

	@Then("I Should see the list of Available Trains")
	public void i_should_see_the_list_of_available_trains() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	//Scenario 2
	TrainByName tr1 = new TrainByName(driver);
	@When("I click on Search By Name\\/Number")
	public void i_click_on_search_by_name_number() {

//        WebElement num = driver.findElement(By.xpath("//span[text()='Search By Name/Number']"));
//        num.click();
        tr1.TN();
	}

	@When("I click on Train By Name\\/Number bar")
	public void i_click_on_train_by_name_number_bar() {
	   
//		WebElement TrainName = driver.findElement(By.xpath("//input[@placeholder='Enter the train name or number']"));
//		TrainName.click();
		tr1.Name();
//		WebElement Name = driver.findElement(By.xpath("(//div[@data-acindex='0']//div)[2]"));
//		Name.click();
		tr1.NameClick();
		
	}

	@When("I click on Search")
	public void i_click_on_search() {
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id='content']/div[1]/div[1]/div[3]/div[3]/div[2]/div[2]/button[1]/div[1]"))));
//        Search.click();
        tr1.Search2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Then("I Should see the details about train")
	public void i_should_see_the_details_about_train() {
	   
	}

	//Scenario 3
	RunningStatus tr2 = new RunningStatus(driver);
	@When("I click on Running Status")
	public void i_click_on_running_status() {
	   
//		WebElement Status = driver.findElement(By.xpath("(//span[contains(@class,'nav-list-item u-ib')])[2]"));
//        Status.click();
		tr2.TrainStatus();
       
	}
	@When("I click on Train By Name bar")
	public void i_click_on_train_by_name_bar() {
	    
//		WebElement Tnum = driver.findElement(By.xpath("(//input[@placeholder='Enter the train name or number'])[2]"));
//        Tnum.click();
		tr2.TNumber();
        
//        WebElement number = driver.findElement(By.xpath("(//div[text()='BDTS/Bandra Terminus to BJU/Barauni Jn'])[2]"));
//        number.click();
		tr2.Number1();
	}

	@When("I click on Searchbar")
	public void i_click_on_searchbar() {
	    
//		WebElement S = driver.findElement(By.xpath("//div[@id='content']/div[1]/div[1]/div[3]/div[5]/div[2]/div[2]/button[1]/div[1]"));
//        S.click();
		tr2.Search3();
        
	}
	@Then("I Should see the Running Status for the specific train")
	public void i_should_see_the_running_status_for_the_specific_train(){
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement scroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Tomorrow')]//ancestor::div[@class='date-item u-ib ']")));
//		scroll.click();
		tr2.tmrw();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	
	}
	
	//Scenario 4
	ByStation tr3 = new ByStation(driver);
	@When("I click on Search By Station")
	public void i_click_on_search_by_station() {
	   
//		WebElement SBName = driver.findElement(By.xpath("//span[text()='Search By Station']"));
//		SBName.click();
		tr3.ByStationName();
	}

	@When("I click on the Station Name Bar")
	public void i_click_on_the_station_name_bar(){
	   
//		WebElement SName = driver.findElement(By.xpath("//input[@placeholder='Enter the station name or code']"));
//		SName.click();
//		SName.sendKeys("New Delhi (NDLS)");
//		SName.sendKeys(Keys.RETURN);
		tr3.StationName();
		
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id='stationSearchForm']/div[2]/div[2]/button[1]/div[1]"))));
//		Search.click();
		tr3.Search4();
		
	}

	@Then("I Should See The Available Trains by Station")
	public void i_should_see_the_available_trains_by_station() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	//Scenario 5
	Invalid tr4 = new Invalid(driver);
	@When("I click on Train By Number bar")
	public void i_click_on_train_by_number_bar() {
	   
//		WebElement TrainName = driver.findElement(By.xpath("//input[@placeholder='Enter the train name or number']"));
//		TrainName.click();
//		TrainName.sendKeys("12805");
		tr4.TNUM();
	}

	@When("I Enter name or number and I click search")
	public void i_enter_name_or_number_and_i_click_search() {
	   
//		WebElement Search = driver.findElement(By.xpath("(//button[contains(@class,'c-btn u-link')]//div)[3]"));
//		Search.click();
		tr4.Search5();
	}

	@Then("I should see the Please select a train number or name")
	public void i_should_see_the_please_select_a_train_number_or_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
