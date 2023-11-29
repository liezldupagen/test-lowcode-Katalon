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

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AVQVeywJcxhxcf9EaQq72MiInA9Cna7dRNXltWFVScmSBJyJnebLNEZMjcwA_Hpq1XBdGOXfFZ_Uow&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1476200986%3A1700367378827849&theme=glif#inbox')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'), 'AutomationTest.1123')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_Passwd'), 'V35d/XPbheDiOis+wJw2jUb1EJpyK0+S')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inbox (1) - automationtest.1123gmail.c_e98aac/div_Inbox1'), 
    'Inbox1')

WebUI.rightClick(findTestObject('Object Repository/Page_Inbox (1) - automationtest.1123gmail.c_e98aac/span_Google Community Te'))

WebUI.click(findTestObject('Object Repository/Page_Inbox (1) - automationtest.1123gmail.c_e98aac/svg_Send feedback to Google_Xy'))

WebUI.click(findTestObject('Object Repository/Page_Inbox (1) - automationtest.1123gmail.c_e98aac/a_Send feedback to Google_gb_d gb_Da gb_H'))

WebUI.click(findTestObject('Object Repository/Page_Inbox (1) - automationtest.1123gmail.c_e98aac/span_Sign out'))

