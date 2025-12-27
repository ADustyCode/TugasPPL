import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By

WebUI.openBrowser('')
WebUI.navigateToUrl('http://zero.webappsecurity.com/login.html')

DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_login']")).sendKeys("username")
DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_password']")).sendKeys("password")
DriverFactory.getWebDriver().findElement(By.xpath("//input[@name='submit']")).click()

sleep(1000)
WebUI.navigateToUrl('http://zero.webappsecurity.com/bank/account-summary.html')

assert DriverFactory.getWebDriver().findElement(By.xpath("//h2[text()='Cash Accounts']")).isDisplayed()

//WebUI.closeBrowser()
