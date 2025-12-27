import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.Keys

WebUI.openBrowser('')
WebUI.navigateToUrl('http://zero.webappsecurity.com/login.html')

DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_login']")).sendKeys("username")
DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_password']")).sendKeys("password", Keys.ENTER)

sleep(1000)
WebUI.navigateToUrl('http://zero.webappsecurity.com/bank/account-summary.html')

assert DriverFactory.getWebDriver().findElement(By.xpath("//h2[text()='Cash Accounts']")).isDisplayed()

//WebUI.closeBrowser()
