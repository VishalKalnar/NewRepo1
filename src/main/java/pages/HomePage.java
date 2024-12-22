package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	//WebElement
	 private WebDriver driver;
	 private WebDriverWait wait;
	 
	@FindBy(xpath="//*[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//img[@alt='Great Indian Festival']")
	private WebElement dealSection;
	
	@FindBy(xpath="//span[@class='a-size-base a-color-base'][text()='Books']")
	private WebElement booksSection;
	
	//Constructor 
	public HomePage(WebDriver driver ) // constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	 //Action method 
	public String fetchTitle() 
	{
	 String title=driver.getTitle();
	  return title;
	}
	
	public boolean verifycartIcon() 
	{
	 	 boolean isDisplaying=cartIcon.isDisplayed();
		return isDisplaying;
	}
	
	
	public void enteringDealsSection() 
	{
		wait.until(ExpectedConditions.visibilityOf(dealSection));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", dealSection);
		dealSection.click();
	}
	
	
	public boolean identifyToysTextSection()
	{
		wait.until(ExpectedConditions.visibilityOf(booksSection));
		boolean book= booksSection.isDisplayed();
		
		return book;
		
	}
	
	
	
	
	
	

}
