package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectpackage.DressesPage;
import objectpackage.ObjectClass;
import objectpackage.ProductDetailPage;

public class TestProductDetailpage {

	ProductDetailPage ProductDp;
	DressesPage Dp;
	ObjectClass select;

	public TestProductDetailpage() {

		ProductDp = new ProductDetailPage();
		select = new ObjectClass();
		Dp = new DressesPage();
	}

	@Test
	public void verifyTweetShareinProductDetailspage() {
		select.ClickDressmenu();
		Dp.SelectProduct();
		Assert.assertTrue(ProductDp.btnShare().isDisplayed());
		Assert.assertTrue(ProductDp.btnTweet().isDisplayed());
	}

	@Test(dependsOnMethods = {"verifyTweetShareinProductDetailspage"})
	public void verifyProductDiscriptionProductDetailspage() {
		//select.ClickDressmenu();
	//	Dp.SelectProduct();
        int b=150;
		int ProductDiscription = ProductDp.productDiscription();
		Assert.assertTrue(ProductDiscription<=b);
	}

}
