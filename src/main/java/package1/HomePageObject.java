package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage{
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirt;
	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[1]/label/a")
	private WebElement Ssize;
	
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
    
	public WebElement Women() {
		return Women;
	}
	public WebElement Dresses() {
		return Dresses;
	}
	public WebElement Tshirt() {
		return Tshirt;
	}
	
	public void clickWomen() {
		Women.click();
	}
	public void clickDresses() {
		Dresses.click();
	}
	
	public WebElement Ssizes() {
		return Ssize;
	}
	
	public void clickTshirt() {
		Tshirt.click();
	}
	
	
	
}
