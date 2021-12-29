package objectpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ObjectClass extends BaseClass {
	@FindBy(xpath = "//div[@id='block_top_menu']/ul")
	private WebElement catagorytab;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement tabWomen;
	@FindBy(xpath = "//div/ul/li/a[@title='Dresses']")
	private WebElement tabDress;
	@FindBy(xpath = "//ul//li[3]/a[@title='T-shirts']")
	private WebElement tabTshirts;
	@FindBy(id = "newsletter-input")
	private WebElement textboxnewsletter;
	@FindBy(name = "submitNewsletter")
	private WebElement submitNewsletter;
	@FindBy(xpath = "//div[@id='columns']/p[@class]")
	private WebElement alertMsg;
	@FindBy(xpath = "//div[@id='center_column']/h1/span[1]")
	private WebElement titleblockDresses;
	@FindBy(xpath = "//div[1]/div/div/span[@class='category-name']")
	private WebElement titleblockWomen;
	@FindBy(xpath = "//div[1]/div/div/span[@class='category-name']")
	private WebElement titleblockTshirt;

	public ObjectClass() {
		PageFactory.initElements(driver, this);
	}

	public WebElement tabWomen() {
		 return tabWomen;

	}public WebElement tabDress() {
		 return tabDress;
	}
	public WebElement tabTshirts() {
		 return tabTshirts;
	}
	

	public void SubmittoNewsLetter(String email) {
		setText(textboxnewsletter, email);
		submitNewsletter.click();
	}

	public void ClickWomenmenu() {
		tabWomen.click();
	}

	public void ClickDressmenu() {
		tabDress.click();
	}

	public void ClickTshirtsmenu() {
		tabTshirts.click();
	}

	public String newsletterAlert() {
		return alertMsg.getText();

	}

	public WebElement titleblockDresses() {
		return titleblockDresses;
	}
	public WebElement titleblockTshirt() {
		return titleblockTshirt;
	}
	public WebElement titleblockWomen() {
		return titleblockWomen;
}
}