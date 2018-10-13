

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class MagentoTest 
{
	@Test
	public void posCredentials() throws Exception {
		String url="http://www.magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Mainpage m=new Mainpage(driver);
		m.clickOnMyacc();
		Thread.sleep(3000);
		Loginpage login=new Loginpage(driver);
		login.typeEmail("sucheendra.abc@gmail.com");
		login.typePwd("Welcome123");
		login.clickOnLogin();
		Thread.sleep(3000);
		Logoutpage logout=new Logoutpage(driver);
		logout.clickOnLogout();
		driver.quit();
	}
	
}
