package testpackage;

import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;
import objectpackage.DressesPage;
import objectpackage.ObjectClass;

public class TestClass {
	ObjectClass submit;
	ObjectClass select;
	DressesPage Dp;
	int random = new Random().nextInt(5005);

	public TestClass() {
		submit = new ObjectClass();
		select = new ObjectClass();

	}

	@Test
	public void verifyCatagoryTabs() {
		Assert.assertTrue(select.tabDress().isDisplayed());
		Assert.assertTrue(select.tabTshirts().isDisplayed());
		Assert.assertTrue(select.tabWomen().isDisplayed());

	}

	@Test
	public void verifyNavigatedCorespondingtab() {
		select.ClickDressmenu();
		Assert.assertTrue(select.titleblockDresses().isDisplayed());
		select.ClickTshirtsmenu();
		Assert.assertTrue(select.titleblockTshirt().isDisplayed());
		select.ClickDressmenu();
		Assert.assertTrue(select.titleblockWomen().isDisplayed());
	}

	@Test
	public void verifyNewsLetterSuccessfulregisterdAlert() {
		submit.SubmittoNewsLetter("shakthi" + random + "@gmail.com");
		String Subscription = submit.newsletterAlert();
		Assert.assertTrue(Subscription.contains("successfully"));
	}

}
