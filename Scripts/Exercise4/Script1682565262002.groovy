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

WebUI.openBrowser('https://phptravels.com/')

WebUI.maximizeWindow()

'Click Chat to Support\r\n'
WebUI.click(findTestObject('Exercise3/btnChatSupport'))

'Input content to chat'
WebUI.setText(findTestObject('Exercise3/txtChatContent'), 'User send message')

'Click Send message'
WebUI.click(findTestObject('Exercise3/btnSendChat'))

'Click button Attach file'
WebUI.click(findTestObject('Exercise4/btnAttachFile'))

'Attach file'
CustomKeywords.'customkeywords.UploadFileKeyword.uploadFile'('C:\\Users\\duynpd\\Desktop\\fileUpload.txt')

'Click Send message'
WebUI.waitForElementClickable(findTestObject('Exercise3/btnSendChat'), 3000)

WebUI.click(findTestObject('Exercise3/btnSendChat'))

'Verify File is uploaded'
String fileName = WebUI.getText(findTestObject('Exercise4/lastFileUpload'))

Assert.assertTrue(fileName.contains('fileUpload'))

'Close Browser'
WebUI.closeBrowser()

