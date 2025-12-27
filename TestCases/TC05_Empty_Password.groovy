import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By

WebUI.openBrowser('')
WebUI.navigateToUrl('http://zero.webappsecurity.com/login.html')

DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_login']")).sendKeys("username")
DriverFactory.getWebDriver().findElement(By.xpath("//input[@name='submit']")).click()

assert DriverFactory.getWebDriver().findElement(By.xpath("//div[contains(@class,'alert-error')]")).isDisplayed()

//WebUI.closeBrowser()
