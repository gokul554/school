package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HTMLPage {
  
	@FindBy(xpath=".//*[contains(text(),'Java Intro')]")
	private WebElement JavaIntroTab;
	
	@FindBy(xpath=".//*[contains(text(),'Java Syntax')]")
	private WebElement JavaSyntaxTab;
	
	@FindBy(xpath=".//*[contains(text(),'Syntax')]")
	private WebElement JavaTab;
	
	@FindBy(xpath=".//*[contains(text(),'Java main')]")
	private WebElement JavamainTab;
	
	@FindBy(xpath=".//*[contains(text(),'Syntax')]")
	private WebElement SyntaxTab;
	
	@FindBy(xpath=".//*[contains(text(), 'Intro')]")
	private WebElement IntroTab;
	
	@FindBy(xpath=".//*[contains(text(), 'Intro')]")
	private WebElement RootTab;

}


