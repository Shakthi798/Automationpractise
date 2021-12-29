package objectpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BaseClass {
	@FindBy(xpath = "//div[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	private WebElement btnTweet;
	@FindBy(xpath = "//div[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	private WebElement btnShare;
	@FindBy(xpath = "//div[@id='short_description_content']/p")
	private WebElement productDiscription;
	
	public ProductDetailPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement btnTweet() {
		return btnTweet;
	}

	public WebElement btnShare() {
		return btnShare;
	}

	public int productDiscription() {
		 return productDiscription.getText().length();	
	}
	

	
}