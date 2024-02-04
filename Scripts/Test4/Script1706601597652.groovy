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

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Amazon.com Page Not Found/img'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazonaccount/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    'vivek.koppu02@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazonaccount/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'ofo5Cd7yjXKREItGPzFDsw==')

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Amazon.com. Spend less. Smile more/span_Hello, Koppu'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Your Account/div_Your Orders                            _3ec75f'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Your Orders/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Your Account/div_Your Addresses                         _6e2e83'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Your Addresses/span_EN'))

WebUI.click(findTestObject('Object Repository/Amazonaccount/Page_Change Language  Currency Settings/div_(function(f) var _np(window.P._namespac_5a8a07'))

