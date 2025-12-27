import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')
WebUI.navigateToUrl('http://zero.webappsecurity.com/bank/account-summary.html')

assert DriverFactory.getWebDriver().getCurrentUrl().contains("login")

//WebUI.closeBrowser()
