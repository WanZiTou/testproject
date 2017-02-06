package com.dbyl.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dbyl.libarary.action.ViewHomePage;
import com.dbyl.libarary.utils.DriverFactory;
import com.dbyl.libarary.utils.TestNGListener;
import com.dbyl.libarary.utils.UITest;
@Listeners({ TestNGListener.class })
public class loginTest extends UITest {
	WebDriver driver;
	


	@BeforeMethod(alwaysRun = true)
	public void init() {
		System.setProperty("webdriver.chrome.driver","webDriver/chromedriver");
	    driver =DriverFactory.getFirefoxDriver();
		super.init(driver);
		ViewHomePage.setDriver(driver);
	}

	@Test(groups = "loginTest")
	public void loginByUerName() throws Exception {
		ViewHomePage.viewMyProfile();
		Assert.fail("Failed test");
	}

	@AfterMethod(alwaysRun = true)
	public void stop() {
		super.stop();
	}

}
