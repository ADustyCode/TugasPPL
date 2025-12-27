import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By

WebUI.openBrowser('')
WebUI.navigateToUrl('http://zero.webappsecurity.com/login.html')

DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_login']")).sendKeys("username")
DriverFactory.getWebDriver().findElement(By.xpath("//input[@id='user_password']")).sendKeys("password")
DriverFactory.getWebDriver().findElement(By.xpath("//input[@name='submit']")).click()
WebUI.navigateToUrl('http://zero.webappsecurity.com/index.html')
DriverFactory.getWebDriver().findElement(By.xpath("//i[@class='icon-user']")).click()
DriverFactory.getWebDriver().findElement(By.xpath("//a[@id='logout_link']")).click()

assert DriverFactory.getWebDriver().findElement(By.xpath("//button[@id='signin_button']"))

//WebUI.closeBrowser()
