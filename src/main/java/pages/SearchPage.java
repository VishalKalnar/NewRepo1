package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	//WebElement
	 private WebDriver driver;
	 private WebDriverWait wait;
	 
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	private WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	private WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"brandsRefinements\"]//ul//*[text()='Samsung']")
	private WebElement samsungBrand;
	
	
	
	public SearchPage(WebDriver driver ) // constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	
		//Action method 
	public void searchProduct(String text) {
		searchBox.sendKeys(text);
//		searchbutton.click();
	}
	
	
	public void searchbutn() {
		searchbutton.click();
	}
	
	public boolean verifyBrand() {
		wait.until(ExpectedConditions.visibilityOf(samsungBrand));
		boolean isDisplayed = samsungBrand.isDisplayed();
		
		return isDisplayed;
	}
	
	
	
	
	
	
	
	
}
