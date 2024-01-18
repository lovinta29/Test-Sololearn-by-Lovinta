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

WebUI.navigateToUrl('https://www.sololearn.com/en/')

WebUI.click(findTestObject('Object Repository/Page_Sololearn Learn to Code/div_sl-hamburger__button'))

WebUI.click(findTestObject('Object Repository/Page_Sololearn Learn to Code/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Sololearn Learn to Code/input_email'), 'lovinvivinta29@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sololearn Learn to Code/input_password'), 'CWz8ZXG3Y3SLXfrm3eyhN1XxVua/1h64keA6cIGrG+0=')

WebUI.click(findTestObject('Object Repository/Page_Sololearn Learn to Code/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/a_OK'))

WebUI.click(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/div_sl-hamburger__button'))

WebUI.click(findTestObject('Page_Profile_with_Nav/button_next'))

WebUI.click(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/div_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/li_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/input_current'), 'YaRDnf2rE5z3ARXoKG+Ce1Xk2ufB4gJE')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/input_new'), 'CWz8ZXG3Y3SLXfrm3eyhN1XxVua/1h64keA6cIGrG+0=')

WebUI.click(findTestObject('Object Repository/Page_Lovinta Oktavia Hutagalung/input_sl-p-password-form__submit'))

