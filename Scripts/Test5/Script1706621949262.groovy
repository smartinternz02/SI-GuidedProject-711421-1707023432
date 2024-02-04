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

WebUI.click(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com Page Not Found/img'))

WebUI.setText(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'soap')

WebUI.click(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com  soap/img_Results_s-image'))

WebUI.click(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com  Dove Beauty Bar Cleanser f_be1d17/input_Shipping cost, delivery date, and ord_223673'))

WebUI.click(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com Shopping Cart/a_Go to Cart'))

WebUI.click(findTestObject('Object Repository/AmazonRemoveCart/Page_Amazon.com Shopping Cart/input_Update_submit.delete.f61e73c0-ffc0-41_fc858a'))

