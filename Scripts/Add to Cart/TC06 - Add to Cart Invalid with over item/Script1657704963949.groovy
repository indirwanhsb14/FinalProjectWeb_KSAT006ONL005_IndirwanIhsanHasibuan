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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.WebsiteUrl)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Home/btn_Shop'), 0)

WebUI.click(findTestObject('Home/btn_Shop'))

WebUI.click(findTestObject('Add to Cart/img_ProductAlbum'))

WebUI.waitForElementVisible(findTestObject('Add to Cart/verify_ImgProduct'), 5)

WebUI.waitForElementVisible(findTestObject('Add to Cart/setText_QtyProduct'), 5)

WebUI.click(findTestObject('Add to Cart/setText_QtyProduct'))

WebUI.clearText(findTestObject('Add to Cart/setText_QtyProduct'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add to Cart/setText_QtyProduct'), qty)

WebUI.waitForElementVisible(findTestObject('Add to Cart/viewText_ProductAlbum'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Add to Cart/viewText_PriceProduct'), 5)

WebUI.click(findTestObject('Add to Cart/button_Add to cart'))
