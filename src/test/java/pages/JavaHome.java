package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaHome {
	
	//HomePageWebElements
	
	@FindBy(xpath=".//*[contains(text(),'Java Intro')]")
	private WebElement JavaIntroTab;
	
	@FindBy(xpath=".//*[contains(text(),'Java Syntax')]")
	private WebElement JavaSyntaxTab;
	
	private WebDriver driver =null;
	
	public JavaHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean launchW3schools(String URL)
	{
		driver.get(URL);
		return JavaIntroTab.isDisplayed();
		
	}
	
	public void Actions_on_JavaHome_page()
	{
		JavaIntroTab.click();
		JavaSyntaxTab.click();
	}

}
