package package2;

import org.testng.annotations.Test;

import junit.framework.Assert;
import package1.BasePage;
import package1.DressPageObject;
import package1.HomePageObject;

public class HomePageTest {
	HomePageObject hp;
	BasePage bp; 
	DressPageObject dp;
	 
	public  HomePageTest() {
		hp=new HomePageObject();
		bp=new BasePage();
		dp=new DressPageObject();
	}
	
	@Test
	public void verifyWomen() {
		Assert.assertTrue(hp.Women().isDisplayed());
	}
	@Test
	public void verifyDresses() {
		Assert.assertTrue(hp.Dresses().isDisplayed());
	}
	@Test
	public void verifyTshirt() {
		Assert.assertTrue(hp.Tshirt().isDisplayed());
	}
	@Test
	public void verifySsize() {
		Assert.assertTrue(hp.Ssizes().isDisplayed());
	}
	
//	@Test
//	public void verifyProductCount() {
//		
//		Assert.assertTrue(dp.getPoductNumberFromHeader()==dp.getProductCount());
//	}
	@Test
	public void verifyclickWomen()
	{
		hp.clickWomen();
	}
	@Test
	public void verifyclickDresses()
	{
		hp.clickDresses();
	}
	@Test
	public void verifyclickTshirt()
	{
		hp.clickTshirt();
	}


}
