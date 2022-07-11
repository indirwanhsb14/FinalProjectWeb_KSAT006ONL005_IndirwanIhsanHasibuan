import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CucumberKW.runFeatureFile('Include/features/WP-2 Indirwan-TC Login Website.feature')

WebUI.openBrowser(GlobalVariable.WebsiteUrl)

/*WebUI.navigateToUrl(GlobalVariable.WebsiteUrl)*/
WebUI.waitForElementPresent(findTestObject('Home/btn_LoginMenu'), 3)

WebUI.click(findTestObject('Home/btn_LoginMenu'))

WebUI.clearText(findTestObject('Login/setText_LoginUsername'))

WebUI.setText(findTestObject('Object Repository/Login/setText_LoginUsername'), username)

WebUI.clearText(findTestObject('Login/setText_LoginPassword'))

WebUI.setText(findTestObject('Object Repository/Login/setText_LoginPassword'), password)

WebUI.click(findTestObject('Object Repository/Login/btn_Login'), FailureHandling.STOP_ON_FAILURE)

userProfile = ((GlobalVariable.MyAccountUrl + username.toLowerCase()) + '/')

WebUI.navigateToUrl(userProfile)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('MyAccount/txt_MyAccount'), 5, FailureHandling.OPTIONAL)

WebUI.navigateToUrl(GlobalVariable.LoginUrl)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('MyAccount/txt_MyAccount'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('MyAccount/txt_MyAccount'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MyAccount/txt_MyAccount'))

