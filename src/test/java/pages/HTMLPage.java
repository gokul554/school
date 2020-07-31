package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HTMLPage {
  
	@FindBy(xpath=".//*[contains(text(),'Java Intro')]")
	private WebElement JavaIntroTab;
	
	@FindBy(xpath=".//*[contains(text(),'Java Syntax')]")
	private WebElement JavaSyntaxTab;

}


