package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import objectpackage.DressesPage;
import objectpackage.ObjectClass;

public class TestDresspage {
	DressesPage Dp;
	ObjectClass select;

	public TestDresspage() {

		select = new ObjectClass();

		Dp = new DressesPage();
	}

	@Test
	public void verifySizeBlockisDisplayed1() {
		select.ClickDressmenu();
		Assert.assertTrue(Dp.sizeBlock().isDisplayed());
		Assert.assertTrue(Dp.sizeS().isDisplayed());
		Assert.assertTrue(Dp.sizeM().isDisplayed());
		Assert.assertTrue(Dp.sizeL().isDisplayed());
	}

	@Test
	public void verifyProductCount2() {

		Assert.assertSame(Dp.Productlist(), Dp.ShowingProuctcount());

	}

	@Test(dependsOnMethods = {"verifySizeBlockisDisplayed1"})
	public void verifyProductAddedtoCart3() {
		select.ClickDressmenu();
		Dp.Actions();
		//Assert.assertTrue(Dp.productaddedincart().contains("successfully"));
	}
}
