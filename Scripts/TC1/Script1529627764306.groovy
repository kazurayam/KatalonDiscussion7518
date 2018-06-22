import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl("http://${GlobalVariable.hostname}/")

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'), 10, FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)  // pause for 3 seconds to see the displayed page

WebUI.closeBrowser()

