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

WebUI.navigateToUrl(GlobalVariable.WebsiteUrl)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Checkout/viewText_Checkout'), 0)

WebUI.setText(findTestObject('Checkout/setText_firstName'), 'indirwan')

WebUI.verifyElementPresent(findTestObject('Checkout/setText_LastName'), 0)

WebUI.setText(findTestObject('Checkout/setText_LastName'), 'ihsan')

WebUI.click(findTestObject('Checkout/dropdown_Indonesia'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Checkout/setText_StreetAddress'), 3)

WebUI.waitForElementClickable(findTestObject('Checkout/setText_StreetAddress'), 0)

WebUI.setText(findTestObject('Checkout/setText_StreetAddress'), 'Jl.Mengkudu')

WebUI.waitForElementPresent(findTestObject('Checkout/setText_City'), 0)

WebUI.setText(findTestObject('Checkout/setText_City'), 'Fruit City')

WebUI.click(findTestObject('Checkout/dropdown_DKI Jakarta'))

WebUI.verifyElementPresent(findTestObject('Checkout/setText_Postcode'), 0)

WebUI.setText(findTestObject('Checkout/setText_Postcode'), '421189')

WebUI.verifyElementPresent(findTestObject('Checkout/setText_Phone'), 0)

WebUI.setText(findTestObject('Checkout/setText_Phone'), '081256781907')

WebUI.verifyElementPresent(findTestObject('Checkout/setText_EmailAddress'), 0)

WebUI.setText(findTestObject('Checkout/setText_EmailAddress'), 'indirwan@gmail.com')

WebUI.verifyElementPresent(findTestObject('Checkout/checkbox_BNI'), 0)

WebUI.click(findTestObject('Checkout/checkbox_BNI'))

WebUI.verifyElementPresent(findTestObject('Checkout/button_Place order'), 0)

WebUI.click(findTestObject('Checkout/button_Place order'))

