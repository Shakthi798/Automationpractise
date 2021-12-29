package objectpackage;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends BaseClass {
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_1']")
	private WebElement sizeS;
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_2']")
	private WebElement sizeM;
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_3']")
	private WebElement sizeL;
	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']")
	private WebElement sizeBlock;
	@FindBy(xpath = "//span [@class='heading-counter']")
	private WebElement productCount;
	@FindBy(xpath = "//div[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
	private WebElement Select1Product;
	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> getProductlist;
	@FindBy(xpath = "//div/span/input[@id='layered_id_attribute_group_1']")
	private WebElement checkbocSizeS;
	@FindBy(xpath = "//div[@id='center_column']/h1/span[2]")
	private WebElement ProdutctcountShowing;
	@FindBy(xpath = "//div[@id='layer_cart']/div[1]/div[1]/h2[text()]")
	private WebElement productinCart;
	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement productAddtoCart;

	public DressesPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement sizeS() {
		return sizeS;
	}

	public WebElement sizeM() {
		return sizeM;
	}

	public WebElement sizeBlock() {
		return sizeBlock;
	}

	public WebElement sizeL() {

		return sizeL;
	}

	public String totalproductshowing() {
		return productCount.getText();
	}

	public void SelectProduct() {
		Select1Product.click();
	}

	public void clickcheckbocSizeS() {

		checkbocSizeS.click();
	}

	public int ShowingProuctcount() {
		return Integer.parseInt(ProdutctcountShowing.getText().split(" ")[2]);

	}

	public void clickproductAddtoCart() {

		productAddtoCart.click();
	}

	public int Productlist() {
		return getProductlist.size();

	}

	public void Actions() {
		mouseover(Select1Product, productAddtoCart);

	}

	public String productaddedincart() {
		return productinCart.getText();
	}

}