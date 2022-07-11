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

WebUI.openBrowser(GlobalVariable.WebsiteUrl)

WebUI.delay(5)

WebUI.click(findTestObject('Home/btn_RegisterNowMenu'))

WebUI.clearText(findTestObject('RegisterNow/setText_User'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('RegisterNow/setText_UsernameRegister'), username)

WebUI.clearText(findTestObject('RegisterNow/setText_EmailRegis'))

WebUI.setText(findTestObject('RegisterNow/setText_EmailRegis'), email)

WebUI.setText(findTestObject('RegisterNow/setText_PhoneNumber'), phonenumber)

WebUI.setText(findTestObject('RegisterNow/setText_PasswordRegister'), password)

WebUI.setText(findTestObject('RegisterNow/setText_ConfirmPassword'), confirmpassword)

WebUI.setText(findTestObject('RegisterNow/setText_Address'), address)

WebUI.click(findTestObject('RegisterNow/btn_RegisterNow'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

